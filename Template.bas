B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.2
@EndOfDesignText@

Sub Class_Globals
	Dim App As AWTRIX
	Dim iconID As Int = 487
	'Declare your variables here
	Dim firstDayHigh As String = "0"
	Dim firstDayLow As String = "0"
	Dim firstDayIcon As Int = 487
	
	Dim secondDayHigh As String = "0"
	Dim secondDayLow As String = "0"
	Dim secondDayIcon As Int = 487
	
End Sub

' ignore
public Sub GetNiceName() As String
	Return App.name
End Sub

' ignore
public Sub Run(Tag As String, Params As Map) As Object
	Return App.interface(Tag,Params)
End Sub

' Config your App
Public Sub Initialize() As String
	
	'initialize the AWTRIX class and parse the instance; dont touch this
	App.Initialize(Me,"App")
	
	'App name (must be unique, no spaces)
	App.name = "Template"
	
	'Version of the App
	App.version = "2.0"
	
	'Description of the App. You can use HTML to format it
	App.description = $"
	This is just a template
	"$
	
	'The developer if this App
	App.author = "Blueforcer"

	'Icon (ID) to be displayed in the Appstore and MyApps
	App.coverIcon = 349
	
	'needed Settings for this App wich can be configurate from user via webinterface. Dont use spaces here!
	App.Settings=CreateMap("APIKey":"","CityID":"beijing")
		
	'Setup Instructions. You can use HTML to format it
	App.setupDescription = $"
	<b>CustomText:</b>Text wich will be shown<br/>
	"$
	
	'define some tags to simplify the search in the Appstore
	App.tags = Array As String("Template", "Awesome")
	
	'How many downloadhandlers should be generated
	App.downloads = 1
	
	'IconIDs from AWTRIXER. You can add multiple if you need more
	App.Icons=Array(349,486,346,344,313,467)
	
	'Tickinterval in ms (should be 65 by default, for smooth scrolling))
	App.tick = 65
	
	'If set to true AWTRIX will wait for the "finish" command before switch to the next app.
	App.lock = False
	
	'This tolds AWTRIX that this App is an Game.
	App.isGame = False
	
	'If set to true, AWTRIX will download new data before each start.
	App.forceDownload = False

	'ignore
	App.makeSettings
	Return "AWTRIX20"
End Sub

'this sub is called right before AWTRIX will display your App
Sub App_Started
	
End Sub
	
'this sub is called if AWTRIX switch to thee next app and pause this one
Sub App_Exited
	
End Sub	

'This sub is called right before AWTRIX will display your App.
'If you need to another Icon you can set your Iconlist here again.
Sub App_iconRequest
	'App.Icons = Array As Int(4)
End Sub

'If the user change any Settings in the webinterface, this sub will be called
Sub App_settingsChanged
	
End Sub

'If you create an Game, use this sub to get the button presses from the Weeebinterface or Controller
'button defines the buttonID of thee controller, dir is true if it is pressed
Sub App_controllerButton(button As Int,dir As Boolean)
	
End Sub

'If you create an Game, use this sub to get the Analog Values of thee connected Controller
Sub App_controllerAxis(axis As Int, dir As Float)

End Sub

'This sub is called when the user presses the middle touchbutton while the app is running
Sub App_buttonPush
	
End Sub

'It possible to create your own setupscreen in HTML.
'This is a very dirty workaround, but its works:)
'Every input must contains an ID with the corresponding settingskey in lowercase 
Sub App_CustomSetupScreen As String
	Return ""
End Sub

'Called with every update from Awtrix
'return one URL for each downloadhandler
Sub App_startDownload(jobNr As Int)
	Select jobNr
		Case 1
			App.Download("https://api.seniverse.com/v3/weather/daily.json?key="&App.get("APIKey")&"&location="&App.get("CityID")&"&language=zh-Hans&unit=c&start=0&days=2")
	End Select
End Sub

'process the response from each download handler
'if youre working with JSONs you can use this online parser
'to generate the code automaticly
'https://json.blueforcer.de/ 
Sub App_evalJobResponse(Resp As JobResponse)
	Try
		If Resp.success Then
			Select Resp.jobNr
				Case 1
					Dim parser As JSONParser
					parser.Initialize(Resp.ResponseString)
					Dim root As Map = parser.NextObject
					Dim results As List = root.Get("results")
					Dim TMap As Map = results.Get("0")
					Dim dailys As List = TMap.Get("daily")
					Dim today As Map = dailys.Get("0")
					Dim tommorow As Map = dailys.Get("1")
					Dim firstDayLowValue As String =  today.Get("low")
					firstDayLow = firstDayLowValue&"";
					firstDayHigh = today.Get("high")
					firstDayIcon = getIconID(today.Get("code_day"))
				
					secondDayLow = tommorow.Get("low")
					secondDayHigh = tommorow.Get("high")
					secondDayIcon = getIconID( tommorow.Get("code_day"))
					
			End Select
		End If
	Catch
		App.throwError(LastException)
	End Try
End Sub

'With this sub you build your frame wtih eveery Tick.
Sub App_genFrame
	If App.startedAt<DateTime.Now-App.duration*1000/2 Then
		App.genSimpleFrame("TMR:"&secondDayLow&"°~"&secondDayHigh&"°",secondDayIcon,False,False,Null,True)
	Else
		App.genSimpleFrame("Today:"&firstDayLow&"°~"&firstDayHigh&"°",firstDayIcon,False,False,Null,True)
	End If
	

End Sub


Sub getIconID (weatherCode As Int)As Short
	If weatherCode>=0 And weatherCode<=3 Then 
		Return 349
	Else If weatherCode>=4 And weatherCode<9 Then
		Return 486
	Else If weatherCode>=10 And weatherCode<20 Then
		Return 346
	Else If weatherCode>=21 And weatherCode<25 Then
		Return 344
	Else If weatherCode>=27 And weatherCode<33 Then
		Return 313
	Else
		Return 467
	End If
End Sub