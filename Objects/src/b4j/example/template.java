package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class template extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.template", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.template.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.awtrix _app = null;
public String _firstdayhigh = "";
public String _firstdaylow = "";
public int _firstdayicon = 0;
public String _seconddayhigh = "";
public String _seconddaylow = "";
public int _seconddayicon = 0;
public int _currenttime = 0;
public String  _app_buttonpush() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub App_buttonPush";
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _app_controlleraxis(int _axis,float _dir) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub App_controllerAxis(axis As Int, dir As Float)";
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _app_controllerbutton(int _button,boolean _dir) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub App_controllerButton(button As Int,dir As Bool";
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _app_customsetupscreen() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub App_CustomSetupScreen As String";
 //BA.debugLineNum = 124;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _app_evaljobresponse(b4j.example.awtrix._jobresponse _resp) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _results = null;
anywheresoftware.b4a.objects.collections.Map _tmap = null;
anywheresoftware.b4a.objects.collections.List _dailys = null;
anywheresoftware.b4a.objects.collections.Map _today = null;
anywheresoftware.b4a.objects.collections.Map _tommorow = null;
String _firstdaylowvalue = "";
 //BA.debugLineNum = 140;BA.debugLine="Sub App_evalJobResponse(Resp As JobResponse)";
 //BA.debugLineNum = 141;BA.debugLine="Try";
try { //BA.debugLineNum = 142;BA.debugLine="If Resp.success Then";
if (_resp.Success /*boolean*/ ) { 
 //BA.debugLineNum = 143;BA.debugLine="Select Resp.jobNr";
switch (BA.switchObjectToInt(_resp.jobNr /*int*/ ,(int) (1))) {
case 0: {
 //BA.debugLineNum = 145;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 146;BA.debugLine="parser.Initialize(Resp.ResponseString)";
_parser.Initialize(_resp.ResponseString /*String*/ );
 //BA.debugLineNum = 147;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 148;BA.debugLine="Dim results As List = root.Get(\"results\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("results"))));
 //BA.debugLineNum = 149;BA.debugLine="Dim TMap As Map = results.Get(\"0\")";
_tmap = new anywheresoftware.b4a.objects.collections.Map();
_tmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_results.Get((int)(Double.parseDouble("0")))));
 //BA.debugLineNum = 150;BA.debugLine="Dim dailys As List = TMap.Get(\"daily\")";
_dailys = new anywheresoftware.b4a.objects.collections.List();
_dailys = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_tmap.Get((Object)("daily"))));
 //BA.debugLineNum = 151;BA.debugLine="Dim today As Map = dailys.Get(\"0\")";
_today = new anywheresoftware.b4a.objects.collections.Map();
_today = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_dailys.Get((int)(Double.parseDouble("0")))));
 //BA.debugLineNum = 152;BA.debugLine="Dim tommorow As Map = dailys.Get(\"1\")";
_tommorow = new anywheresoftware.b4a.objects.collections.Map();
_tommorow = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_dailys.Get((int)(Double.parseDouble("1")))));
 //BA.debugLineNum = 153;BA.debugLine="Dim firstDayLowValue As String =  today.Get(\"";
_firstdaylowvalue = BA.ObjectToString(_today.Get((Object)("low")));
 //BA.debugLineNum = 154;BA.debugLine="firstDayLow = firstDayLowValue&\"\";";
_firstdaylow = _firstdaylowvalue+"";
 //BA.debugLineNum = 155;BA.debugLine="firstDayHigh = today.Get(\"high\")";
_firstdayhigh = BA.ObjectToString(_today.Get((Object)("high")));
 //BA.debugLineNum = 156;BA.debugLine="firstDayIcon = getIconID(today.Get(\"code_day\"";
_firstdayicon = (int) (_geticonid((int)(BA.ObjectToNumber(_today.Get((Object)("code_day"))))));
 //BA.debugLineNum = 158;BA.debugLine="secondDayLow = tommorow.Get(\"low\")";
_seconddaylow = BA.ObjectToString(_tommorow.Get((Object)("low")));
 //BA.debugLineNum = 159;BA.debugLine="secondDayHigh = tommorow.Get(\"high\")";
_seconddayhigh = BA.ObjectToString(_tommorow.Get((Object)("high")));
 //BA.debugLineNum = 160;BA.debugLine="secondDayIcon = getIconID( tommorow.Get(\"code";
_seconddayicon = (int) (_geticonid((int)(BA.ObjectToNumber(_tommorow.Get((Object)("code_day"))))));
 //BA.debugLineNum = 162;BA.debugLine="DateTime.TimeFormat = \"HH\"";
__c.DateTime.setTimeFormat("HH");
 //BA.debugLineNum = 163;BA.debugLine="currentTime= DateTime.Time(DateTime.Now)";
_currenttime = (int)(Double.parseDouble(__c.DateTime.Time(__c.DateTime.getNow())));
 break; }
}
;
 };
 } 
       catch (Exception e25) {
			ba.setLastException(e25); //BA.debugLineNum = 167;BA.debugLine="App.throwError(LastException)";
_app._throwerror /*String*/ (BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _app_exited() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub App_Exited";
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _app_genframe() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub App_genFrame";
 //BA.debugLineNum = 173;BA.debugLine="If App.startedAt<DateTime.Now-App.duration*1000/2";
if (_app._getstartedat /*long*/ ()<__c.DateTime.getNow()-_app._getduration /*int*/ ()*1000/(double)2) { 
 //BA.debugLineNum = 174;BA.debugLine="App.genSimpleFrame(\"TMR:\"&secondDayLow&\"°\"&App.g";
_app._gensimpleframe /*String*/ ("TMR:"+_seconddaylow+"°"+BA.ObjectToString(_app._get /*Object*/ ("Separator"))+_seconddayhigh+"°",_seconddayicon,__c.False,__c.False,(int[])(__c.Null),__c.True);
 }else {
 //BA.debugLineNum = 177;BA.debugLine="If currentTime>18 Then";
if (_currenttime>18) { 
 //BA.debugLineNum = 178;BA.debugLine="App.genSimpleFrame(\"Today:\"&firstDayLow&\"°\"&App";
_app._gensimpleframe /*String*/ ("Today:"+_firstdaylow+"°"+BA.ObjectToString(_app._get /*Object*/ ("Separator"))+_firstdayhigh+"°",(int) (348),__c.False,__c.False,(int[])(__c.Null),__c.True);
 }else {
 //BA.debugLineNum = 180;BA.debugLine="App.genSimpleFrame(\"Today:\"&firstDayLow&\"°\"&App";
_app._gensimpleframe /*String*/ ("Today:"+_firstdaylow+"°"+BA.ObjectToString(_app._get /*Object*/ ("Separator"))+_firstdayhigh+"°",_firstdayicon,__c.False,__c.False,(int[])(__c.Null),__c.True);
 };
 };
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _app_iconrequest() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub App_iconRequest";
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _app_settingschanged() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub App_settingsChanged";
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _app_startdownload(int _jobnr) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub App_startDownload(jobNr As Int)";
 //BA.debugLineNum = 130;BA.debugLine="Select jobNr";
switch (_jobnr) {
case 1: {
 //BA.debugLineNum = 132;BA.debugLine="App.Download(\"https://api.seniverse.com/v3/weat";
_app._download /*String*/ ("https://api.seniverse.com/v3/weather/daily.json?key="+BA.ObjectToString(_app._get /*Object*/ ("APIKey"))+"&location="+BA.ObjectToString(_app._get /*Object*/ ("CityID"))+"&language=zh-Hans&unit=c&start=0&days=2");
 break; }
}
;
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _app_started() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub App_Started";
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim App As AWTRIX";
_app = new b4j.example.awtrix();
 //BA.debugLineNum = 5;BA.debugLine="Dim firstDayHigh As String = \"0\"";
_firstdayhigh = "0";
 //BA.debugLineNum = 6;BA.debugLine="Dim firstDayLow As String = \"0\"";
_firstdaylow = "0";
 //BA.debugLineNum = 7;BA.debugLine="Dim firstDayIcon As Int = 487";
_firstdayicon = (int) (487);
 //BA.debugLineNum = 9;BA.debugLine="Dim secondDayHigh As String = \"0\"";
_seconddayhigh = "0";
 //BA.debugLineNum = 10;BA.debugLine="Dim secondDayLow As String = \"0\"";
_seconddaylow = "0";
 //BA.debugLineNum = 11;BA.debugLine="Dim secondDayIcon As Int = 487";
_seconddayicon = (int) (487);
 //BA.debugLineNum = 13;BA.debugLine="Dim currentTime As Int = 0";
_currenttime = (int) (0);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public short  _geticonid(int _weathercode) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub getIconID (weatherCode As Int)As Short";
 //BA.debugLineNum = 187;BA.debugLine="If weatherCode>=0 And weatherCode<=3 Then";
if (_weathercode>=0 && _weathercode<=3) { 
 //BA.debugLineNum = 188;BA.debugLine="Return 349";
if (true) return (short) (349);
 }else if(_weathercode>=4 && _weathercode<=9) { 
 //BA.debugLineNum = 190;BA.debugLine="Return 486";
if (true) return (short) (486);
 }else if(_weathercode>=10 && _weathercode<=20) { 
 //BA.debugLineNum = 192;BA.debugLine="Return 346";
if (true) return (short) (346);
 }else if(_weathercode>=21 && _weathercode<=25) { 
 //BA.debugLineNum = 194;BA.debugLine="Return 344";
if (true) return (short) (344);
 }else if(_weathercode>=27 && _weathercode<=33) { 
 //BA.debugLineNum = 196;BA.debugLine="Return 313";
if (true) return (short) (313);
 }else {
 //BA.debugLineNum = 198;BA.debugLine="Return 467";
if (true) return (short) (467);
 };
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return (short)0;
}
public String  _getnicename() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="public Sub GetNiceName() As String";
 //BA.debugLineNum = 18;BA.debugLine="Return App.name";
if (true) return _app._getname /*String*/ ();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize() As String";
 //BA.debugLineNum = 30;BA.debugLine="App.Initialize(Me,\"App\")";
_app._initialize /*String*/ (ba,this,"App");
 //BA.debugLineNum = 33;BA.debugLine="App.name = \"Template\"";
_app._setname /*String*/ ("Template");
 //BA.debugLineNum = 36;BA.debugLine="App.version = \"2.0\"";
_app._setversion /*String*/ ("2.0");
 //BA.debugLineNum = 39;BA.debugLine="App.description = $\" 	This is just a template 	\"$";
_app._setdescription /*String*/ (("\n"+"	This is just a template\n"+"	"));
 //BA.debugLineNum = 44;BA.debugLine="App.author = \"Blueforcer\"";
_app._setauthor /*String*/ ("Blueforcer");
 //BA.debugLineNum = 47;BA.debugLine="App.coverIcon = 349";
_app._setcovericon((int) (349));
 //BA.debugLineNum = 50;BA.debugLine="App.Settings=CreateMap(\"APIKey\":\"\",\"CityID\":\"beij";
_app._setsettings(__c.createMap(new Object[] {(Object)("APIKey"),(Object)(""),(Object)("CityID"),(Object)("beijing"),(Object)("Separator"),(Object)("~")}));
 //BA.debugLineNum = 53;BA.debugLine="App.setupDescription = $\" 	<b>CustomText:</b>Text";
_app._setsetupdescription(("\n"+"	<b>CustomText:</b>Text wich will be shown<br/>\n"+"	"));
 //BA.debugLineNum = 58;BA.debugLine="App.tags = Array As String(\"Template\", \"Awesome\")";
_app._settags /*anywheresoftware.b4a.objects.collections.List*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Template","Awesome"}));
 //BA.debugLineNum = 61;BA.debugLine="App.downloads = 1";
_app._setdownloads((int) (1));
 //BA.debugLineNum = 64;BA.debugLine="App.Icons=Array(348,349,486,346,344,313,467)";
_app._seticons(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(348),(Object)(349),(Object)(486),(Object)(346),(Object)(344),(Object)(313),(Object)(467)}));
 //BA.debugLineNum = 67;BA.debugLine="App.tick = 65";
_app._settick /*String*/ (BA.NumberToString(65));
 //BA.debugLineNum = 70;BA.debugLine="App.lock = False";
_app._setlock(__c.False);
 //BA.debugLineNum = 73;BA.debugLine="App.isGame = False";
_app._setisgame(__c.False);
 //BA.debugLineNum = 76;BA.debugLine="App.forceDownload = False";
_app._setforcedownload(__c.False);
 //BA.debugLineNum = 79;BA.debugLine="App.makeSettings";
_app._makesettings /*String*/ ();
 //BA.debugLineNum = 80;BA.debugLine="Return \"AWTRIX20\"";
if (true) return "AWTRIX20";
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public Object  _run(String _tag,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="public Sub Run(Tag As String, Params As Map) As Ob";
 //BA.debugLineNum = 23;BA.debugLine="Return App.interface(Tag,Params)";
if (true) return _app._interface /*Object*/ (_tag,_params);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
