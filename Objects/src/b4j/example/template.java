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
public String _first_name = "";
public String  _app_buttonpush() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub App_buttonPush";
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _app_controlleraxis(int _axis,float _dir) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub App_controllerAxis(axis As Int, dir As Float)";
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _app_controllerbutton(int _button,boolean _dir) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub App_controllerButton(button As Int,dir As Bool";
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _app_customsetupscreen() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub App_CustomSetupScreen As String";
 //BA.debugLineNum = 118;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _app_evaljobresponse(b4j.example.awtrix._jobresponse _resp) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
 //BA.debugLineNum = 134;BA.debugLine="Sub App_evalJobResponse(Resp As JobResponse)";
 //BA.debugLineNum = 135;BA.debugLine="Try";
try { //BA.debugLineNum = 136;BA.debugLine="If Resp.success Then";
if (_resp.Success /*boolean*/ ) { 
 //BA.debugLineNum = 137;BA.debugLine="Select Resp.jobNr";
switch (BA.switchObjectToInt(_resp.jobNr /*int*/ ,(int) (1))) {
case 0: {
 //BA.debugLineNum = 139;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 140;BA.debugLine="parser.Initialize(Resp.ResponseString)";
_parser.Initialize(_resp.ResponseString /*String*/ );
 //BA.debugLineNum = 141;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 142;BA.debugLine="Dim data As Map = root.Get(\"data\")";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("data"))));
 //BA.debugLineNum = 143;BA.debugLine="first_name = data.Get(\"first_name\")";
_first_name = BA.ObjectToString(_data.Get((Object)("first_name")));
 break; }
}
;
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 147;BA.debugLine="App.throwError(LastException)";
_app._throwerror /*String*/ (BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _app_exited() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub App_Exited";
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _app_genframe() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub App_genFrame";
 //BA.debugLineNum = 153;BA.debugLine="App.genSimpleFrame(\"good\",7,False,False,Null,True";
_app._gensimpleframe /*String*/ ("good",(int) (7),__c.False,__c.False,(int[])(__c.Null),__c.True);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _app_iconrequest() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub App_iconRequest";
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _app_settingschanged() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub App_settingsChanged";
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _app_startdownload(int _jobnr) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub App_startDownload(jobNr As Int)";
 //BA.debugLineNum = 124;BA.debugLine="Select jobNr";
switch (_jobnr) {
case 1: {
 //BA.debugLineNum = 126;BA.debugLine="App.Download(\"https://reqres.in/api/users/2\")";
_app._download /*String*/ ("https://reqres.in/api/users/2");
 break; }
}
;
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _app_started() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub App_Started";
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim App As AWTRIX";
_app = new b4j.example.awtrix();
 //BA.debugLineNum = 6;BA.debugLine="Dim first_name As String";
_first_name = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _getnicename() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="public Sub GetNiceName() As String";
 //BA.debugLineNum = 12;BA.debugLine="Return App.name";
if (true) return _app._getname /*String*/ ();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize() As String";
 //BA.debugLineNum = 24;BA.debugLine="App.Initialize(Me,\"App\")";
_app._initialize /*String*/ (ba,this,"App");
 //BA.debugLineNum = 27;BA.debugLine="App.name = \"Template\"";
_app._setname /*String*/ ("Template");
 //BA.debugLineNum = 30;BA.debugLine="App.version = \"2.0\"";
_app._setversion /*String*/ ("2.0");
 //BA.debugLineNum = 33;BA.debugLine="App.description = $\" 	This is just a template 	\"$";
_app._setdescription /*String*/ (("\n"+"	This is just a template\n"+"	"));
 //BA.debugLineNum = 38;BA.debugLine="App.author = \"Blueforcer\"";
_app._setauthor /*String*/ ("Blueforcer");
 //BA.debugLineNum = 41;BA.debugLine="App.coverIcon = 6";
_app._setcovericon((int) (6));
 //BA.debugLineNum = 44;BA.debugLine="App.settings = CreateMap(\"CustomText\":\"Hello Worl";
_app._setsettings(__c.createMap(new Object[] {(Object)("CustomText"),(Object)("Hello World")}));
 //BA.debugLineNum = 47;BA.debugLine="App.setupDescription = $\" 	<b>CustomText:</b>Text";
_app._setsetupdescription(("\n"+"	<b>CustomText:</b>Text wich will be shown<br/>\n"+"	"));
 //BA.debugLineNum = 52;BA.debugLine="App.tags = Array As String(\"Template\", \"Awesome\")";
_app._settags /*anywheresoftware.b4a.objects.collections.List*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Template","Awesome"}));
 //BA.debugLineNum = 55;BA.debugLine="App.downloads = 1";
_app._setdownloads((int) (1));
 //BA.debugLineNum = 58;BA.debugLine="App.icons = Array(349,7)";
_app._seticons(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(349),(Object)(7)}));
 //BA.debugLineNum = 61;BA.debugLine="App.tick = 65";
_app._settick /*String*/ (BA.NumberToString(65));
 //BA.debugLineNum = 64;BA.debugLine="App.lock = False";
_app._setlock(__c.False);
 //BA.debugLineNum = 67;BA.debugLine="App.isGame = False";
_app._setisgame(__c.False);
 //BA.debugLineNum = 70;BA.debugLine="App.forceDownload = False";
_app._setforcedownload(__c.False);
 //BA.debugLineNum = 73;BA.debugLine="App.makeSettings";
_app._makesettings /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="Return \"AWTRIX20\"";
if (true) return "AWTRIX20";
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public Object  _run(String _tag,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="public Sub Run(Tag As String, Params As Map) As Ob";
 //BA.debugLineNum = 17;BA.debugLine="Return App.interface(Tag,Params)";
if (true) return _app._interface /*Object*/ (_tag,_params);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
