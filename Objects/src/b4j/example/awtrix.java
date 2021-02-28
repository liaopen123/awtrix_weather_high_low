package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class awtrix extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.awtrix", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.awtrix.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _appduration = 0;
public int _mscrollposition = 0;
public boolean _show = false;
public boolean _forcedown = false;
public boolean _lockapp = false;
public anywheresoftware.b4a.objects.collections.List _icon = null;
public String _appname = "";
public String _appversion = "";
public int _tickinterval = 0;
public int _needdownloads = 0;
public int _updateinterval = 0;
public String _appdescription = "";
public String _appauthor = "";
public String _setupinfos = "";
public anywheresoftware.b4a.objects.collections.Map _matrixinfo = null;
public anywheresoftware.b4a.objects.collections.Map _appsettings = null;
public String _serverversion = "";
public int _displaytime = 0;
public int _matrixwidth = 0;
public int _matrixheight = 0;
public anywheresoftware.b4a.objects.collections.Map _downloadheader = null;
public int _pluginversion = 0;
public anywheresoftware.b4a.objects.collections.List _tag = null;
public String _playdescription = "";
public int _cover = 0;
public boolean _game = false;
public long _starttimestamp = 0L;
public anywheresoftware.b4a.objects.collections.Map _icomap = null;
public anywheresoftware.b4a.objects.collections.Map _renderedicons = null;
public anywheresoftware.b4a.objects.collections.Map _animcounter = null;
public anywheresoftware.b4a.objects.collections.List _iconlist = null;
public anywheresoftware.b4a.objects.collections.Map _timermap = null;
public anywheresoftware.b4a.objects.collections.Map _set = null;
public Object _target = null;
public anywheresoftware.b4a.objects.collections.List _commandlist = null;
public int _colorcounter = 0;
public String _starttime = "";
public String _endtime = "";
public anywheresoftware.b4a.objects.collections.Map _charmap = null;
public String _textbuffer = "";
public int _textlength = 0;
public boolean _uppercaseletters = false;
public int[] _systemcolor = null;
public String _event = "";
public boolean _enabled = false;
public short[] _noicon = null;
public boolean _isrunning = false;
public boolean _hideicon = false;
public anywheresoftware.b4a.objects.collections.Map _menu = null;
public anywheresoftware.b4a.objects.collections.List _menulist = null;
public anywheresoftware.b4a.randomaccessfile.B4XSerializator _bc = null;
public boolean _noiconmessage = false;
public boolean _verboselog = false;
public boolean _finishapp = false;
public anywheresoftware.b4a.objects.collections.Map _httpmap = null;
public String _oauthtoken = "";
public boolean _oauth = false;
public anywheresoftware.b4a.objects.collections.Map _oauthmap = null;
public String _mcontenttype = "";
public String _customcolor = "";
public anywheresoftware.b4a.objects.collections.Map _poll = null;
public boolean _mhidden = false;
public boolean _nextstring = false;
public int _waitafterfallingdown = 0;
public int _numberofstring = 0;
public int _yscrollposition = 0;
public boolean _laststring = false;
public long _timegentext2 = 0L;
public boolean _isactive = false;
public int _localtickcount = 0;
public static class _jobresponse{
public boolean IsInitialized;
public int jobNr;
public boolean Success;
public String ResponseString;
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper Stream;
public void Initialize() {
IsInitialized = true;
jobNr = 0;
Success = false;
ResponseString = "";
Stream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _frameobject{
public boolean IsInitialized;
public String text;
public int TextLength;
public int Icon;
public int[] color;
public void Initialize() {
IsInitialized = true;
text = "";
TextLength = 0;
Icon = 0;
color = new int[0];
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addtoiconrenderer(anywheresoftware.b4a.objects.collections.Map _iconmap) throws Exception{
boolean _runmarker = false;
int _ico = 0;
anywheresoftware.b4a.objects.collections.Map _ico1 = null;
anywheresoftware.b4a.objects.Timer _timer = null;
boolean _icoexists = false;
int _timerico = 0;
 //BA.debugLineNum = 209;BA.debugLine="Private Sub addToIconRenderer(iconMap As Map)";
 //BA.debugLineNum = 210;BA.debugLine="Try";
try { //BA.debugLineNum = 211;BA.debugLine="If iconMap.Size=0 Then Return";
if (_iconmap.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 212;BA.debugLine="Dim runMarker As Boolean";
_runmarker = false;
 //BA.debugLineNum = 213;BA.debugLine="If isRunning Then";
if (_isrunning) { 
 //BA.debugLineNum = 214;BA.debugLine="stopIconRenderer";
_stopiconrenderer();
 //BA.debugLineNum = 215;BA.debugLine="runMarker=True";
_runmarker = __c.True;
 };
 //BA.debugLineNum = 217;BA.debugLine="timermap.Clear";
_timermap.Clear();
 //BA.debugLineNum = 218;BA.debugLine="icoMap.Clear";
_icomap.Clear();
 //BA.debugLineNum = 219;BA.debugLine="animCounter.Clear";
_animcounter.Clear();
 //BA.debugLineNum = 220;BA.debugLine="RenderedIcons.Clear";
_renderedicons.Clear();
 //BA.debugLineNum = 221;BA.debugLine="For Each ico As Int In iconMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group12 = _iconmap.Keys();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_ico = (int)(BA.ObjectToNumber(group12.Get(index12)));
 //BA.debugLineNum = 222;BA.debugLine="Dim ico1 As Map = iconMap.get(ico)";
_ico1 = new anywheresoftware.b4a.objects.collections.Map();
_ico1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_iconmap.Get((Object)(_ico))));
 //BA.debugLineNum = 223;BA.debugLine="If ico1.ContainsKey(\"tick\") Then";
if (_ico1.ContainsKey((Object)("tick"))) { 
 //BA.debugLineNum = 224;BA.debugLine="icoMap.Put(ico,ico1.Get(\"data\"))";
_icomap.Put((Object)(_ico),_ico1.Get((Object)("data")));
 //BA.debugLineNum = 225;BA.debugLine="animCounter.Put(ico,0)";
_animcounter.Put((Object)(_ico),(Object)(0));
 //BA.debugLineNum = 226;BA.debugLine="Dim timer As Timer";
_timer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 227;BA.debugLine="timer.Initialize(\"Timer\",ico1.Get(\"tick\"))";
_timer.Initialize(ba,"Timer",BA.ObjectToLongNumber(_ico1.Get((Object)("tick"))));
 //BA.debugLineNum = 228;BA.debugLine="Dim icoExists As Boolean=False";
_icoexists = __c.False;
 //BA.debugLineNum = 229;BA.debugLine="For Each timerico As Int In timermap.Values";
{
final anywheresoftware.b4a.BA.IterableList group20 = _timermap.Values();
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_timerico = (int)(BA.ObjectToNumber(group20.Get(index20)));
 //BA.debugLineNum = 230;BA.debugLine="If timerico=ico Then icoExists=True";
if (_timerico==_ico) { 
_icoexists = __c.True;};
 }
};
 //BA.debugLineNum = 232;BA.debugLine="If Not(icoExists) Then timermap.Put(timer,ico)";
if (__c.Not(_icoexists)) { 
_timermap.Put((Object)(_timer),(Object)(_ico));};
 }else {
 //BA.debugLineNum = 234;BA.debugLine="RenderedIcons.Put(ico,ico1.Get(\"data\"))";
_renderedicons.Put((Object)(_ico),_ico1.Get((Object)("data")));
 };
 }
};
 //BA.debugLineNum = 237;BA.debugLine="If runMarker Then";
if (_runmarker) { 
 //BA.debugLineNum = 238;BA.debugLine="startIconRenderer";
_starticonrenderer();
 };
 } 
       catch (Exception e32) {
			ba.setLastException(e32); //BA.debugLineNum = 241;BA.debugLine="Log(\"Got Error from \" & appName)";
__c.Log("Got Error from "+_appname);
 //BA.debugLineNum = 242;BA.debugLine="Log(\"Error in IconAdder:\")";
__c.Log("Error in IconAdder:");
 //BA.debugLineNum = 243;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _advertisesound(int _soundfile) throws Exception{
 //BA.debugLineNum = 701;BA.debugLine="Public Sub AdvertiseSound(soundfile As Int)";
 //BA.debugLineNum = 702;BA.debugLine="commandList.Add(CreateMap(\"type\":\"advertisesound\"";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("advertisesound"),(Object)("file"),(Object)(_soundfile)}).getObject()));
 //BA.debugLineNum = 703;BA.debugLine="End Sub";
return "";
}
public int  _calctextlength(String _text) throws Exception{
int _length = 0;
int _i = 0;
 //BA.debugLineNum = 446;BA.debugLine="Public Sub calcTextLength(text As String) As Int";
 //BA.debugLineNum = 447;BA.debugLine="If UppercaseLetters Then text = text.ToUpperCase";
if (_uppercaseletters) { 
_text = _text.toUpperCase();};
 //BA.debugLineNum = 448;BA.debugLine="If TextBuffer<>text Then";
if ((_textbuffer).equals(_text) == false) { 
 //BA.debugLineNum = 449;BA.debugLine="Dim Length As Int";
_length = 0;
 //BA.debugLineNum = 450;BA.debugLine="For i=0 To text.Length-1";
{
final int step4 = 1;
final int limit4 = (int) (_text.length()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 451;BA.debugLine="If CharMap.ContainsKey(Asc(text.CharAt(i))) The";
if (_charmap.ContainsKey((Object)(__c.Asc(_text.charAt(_i))))) { 
 //BA.debugLineNum = 452;BA.debugLine="Length=Length+(CharMap.Get(Asc(text.CharAt(i))";
_length = (int) (_length+(double)(BA.ObjectToNumber((_charmap.Get((Object)(__c.Asc(_text.charAt(_i))))))));
 }else {
 //BA.debugLineNum = 454;BA.debugLine="Length=Length+4";
_length = (int) (_length+4);
 };
 }
};
 //BA.debugLineNum = 457;BA.debugLine="TextBuffer=text";
_textbuffer = _text;
 //BA.debugLineNum = 458;BA.debugLine="TextLength=Length";
_textlength = _length;
 //BA.debugLineNum = 459;BA.debugLine="Return Length";
if (true) return _length;
 };
 //BA.debugLineNum = 461;BA.debugLine="Return TextLength";
if (true) return _textlength;
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="private Sub Class_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private Appduration As Int";
_appduration = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private mscrollposition As Int";
_mscrollposition = 0;
 //BA.debugLineNum = 18;BA.debugLine="Private show As Boolean = True";
_show = __c.True;
 //BA.debugLineNum = 19;BA.debugLine="Private forceDown As Boolean";
_forcedown = false;
 //BA.debugLineNum = 20;BA.debugLine="Private LockApp As Boolean = False";
_lockapp = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Private Icon As List";
_icon = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 22;BA.debugLine="Private appName As String";
_appname = "";
 //BA.debugLineNum = 23;BA.debugLine="Private AppVersion As String";
_appversion = "";
 //BA.debugLineNum = 24;BA.debugLine="Private TickInterval As Int";
_tickinterval = 0;
 //BA.debugLineNum = 25;BA.debugLine="Private NeedDownloads As Int = 0";
_needdownloads = (int) (0);
 //BA.debugLineNum = 26;BA.debugLine="Private UpdateInterval As Int = 0";
_updateinterval = (int) (0);
 //BA.debugLineNum = 27;BA.debugLine="Private AppDescription As String";
_appdescription = "";
 //BA.debugLineNum = 28;BA.debugLine="Private AppAuthor As String";
_appauthor = "";
 //BA.debugLineNum = 29;BA.debugLine="Private SetupInfos As String";
_setupinfos = "";
 //BA.debugLineNum = 30;BA.debugLine="Private MatrixInfo As Map";
_matrixinfo = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 31;BA.debugLine="Private appSettings As Map = CreateMap()";
_appsettings = new anywheresoftware.b4a.objects.collections.Map();
_appsettings = __c.createMap(new Object[] {});
 //BA.debugLineNum = 32;BA.debugLine="Private ServerVersion As String";
_serverversion = "";
 //BA.debugLineNum = 33;BA.debugLine="Private DisplayTime As Int";
_displaytime = 0;
 //BA.debugLineNum = 34;BA.debugLine="Private MatrixWidth As Int = 32";
_matrixwidth = (int) (32);
 //BA.debugLineNum = 35;BA.debugLine="Private MatrixHeight As Int = 8";
_matrixheight = (int) (8);
 //BA.debugLineNum = 36;BA.debugLine="Private DownloadHeader As Map";
_downloadheader = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 37;BA.debugLine="Private pluginversion As Int = 1";
_pluginversion = (int) (1);
 //BA.debugLineNum = 38;BA.debugLine="Private Tag As List = Array As String()";
_tag = new anywheresoftware.b4a.objects.collections.List();
_tag = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{});
 //BA.debugLineNum = 39;BA.debugLine="Private playdescription As String";
_playdescription = "";
 //BA.debugLineNum = 40;BA.debugLine="Private Cover As Int";
_cover = 0;
 //BA.debugLineNum = 41;BA.debugLine="Private Game As Boolean";
_game = false;
 //BA.debugLineNum = 42;BA.debugLine="Private startTimestamp As Long";
_starttimestamp = 0L;
 //BA.debugLineNum = 43;BA.debugLine="Private icoMap As Map";
_icomap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 44;BA.debugLine="Private RenderedIcons As Map";
_renderedicons = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="Private animCounter As Map";
_animcounter = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 46;BA.debugLine="Private iconList As List'ignore";
_iconlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 47;BA.debugLine="Private timermap As Map";
_timermap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 48;BA.debugLine="Private set As Map 'ignore";
_set = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 49;BA.debugLine="Private Target As Object";
_target = new Object();
 //BA.debugLineNum = 50;BA.debugLine="Private commandList As List";
_commandlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 51;BA.debugLine="Private colorCounter As Int";
_colorcounter = 0;
 //BA.debugLineNum = 52;BA.debugLine="Private startTime As String =\"0\"";
_starttime = "0";
 //BA.debugLineNum = 53;BA.debugLine="Private endtime As String = \"0\"";
_endtime = "0";
 //BA.debugLineNum = 54;BA.debugLine="Private CharMap As Map";
_charmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 55;BA.debugLine="Private TextBuffer As String";
_textbuffer = "";
 //BA.debugLineNum = 56;BA.debugLine="Private TextLength As Int";
_textlength = 0;
 //BA.debugLineNum = 57;BA.debugLine="Private UppercaseLetters As Boolean";
_uppercaseletters = false;
 //BA.debugLineNum = 58;BA.debugLine="Private SystemColor() As Int";
_systemcolor = new int[(int) (0)];
;
 //BA.debugLineNum = 59;BA.debugLine="Private event As String";
_event = "";
 //BA.debugLineNum = 60;BA.debugLine="Private Enabled As Boolean = True";
_enabled = __c.True;
 //BA.debugLineNum = 61;BA.debugLine="Private noIcon() As Short = Array As Short(0, 0,";
_noicon = new short[]{(short) (0),(short) (0),(short) (0),(short) (63488),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0)};
 //BA.debugLineNum = 62;BA.debugLine="Private isRunning As Boolean";
_isrunning = false;
 //BA.debugLineNum = 63;BA.debugLine="Private hideicon As Boolean";
_hideicon = false;
 //BA.debugLineNum = 64;BA.debugLine="Private Menu As Map";
_menu = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 65;BA.debugLine="Private MenuList As List";
_menulist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 66;BA.debugLine="Private bc As B4XSerializator";
_bc = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
 //BA.debugLineNum = 67;BA.debugLine="Private noIconMessage As Boolean";
_noiconmessage = false;
 //BA.debugLineNum = 68;BA.debugLine="Private verboseLog As Boolean";
_verboselog = false;
 //BA.debugLineNum = 69;BA.debugLine="Private finishApp As Boolean";
_finishapp = false;
 //BA.debugLineNum = 70;BA.debugLine="Type JobResponse (jobNr As Int,Success As Boolean";
;
 //BA.debugLineNum = 71;BA.debugLine="Private httpMap As Map";
_httpmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 72;BA.debugLine="Private OAuthToken As String";
_oauthtoken = "";
 //BA.debugLineNum = 73;BA.debugLine="Private OAuth As Boolean";
_oauth = false;
 //BA.debugLineNum = 74;BA.debugLine="Private oauthmap As Map";
_oauthmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 75;BA.debugLine="Private mContentType As String";
_mcontenttype = "";
 //BA.debugLineNum = 76;BA.debugLine="Private customcolor As String";
_customcolor = "";
 //BA.debugLineNum = 77;BA.debugLine="Private poll As Map = CreateMap(\"enable\":False,\"s";
_poll = new anywheresoftware.b4a.objects.collections.Map();
_poll = __c.createMap(new Object[] {(Object)("enable"),(Object)(__c.False),(Object)("sub"),(Object)("")});
 //BA.debugLineNum = 78;BA.debugLine="Private mHidden As Boolean";
_mhidden = false;
 //BA.debugLineNum = 80;BA.debugLine="Type FrameObject(text As String,TextLength As Int";
;
 //BA.debugLineNum = 81;BA.debugLine="Private nextString As Boolean = False";
_nextstring = __c.False;
 //BA.debugLineNum = 82;BA.debugLine="Private waitAfterFallingDown As Int";
_waitafterfallingdown = 0;
 //BA.debugLineNum = 83;BA.debugLine="Private numberOfString As Int = 0";
_numberofstring = (int) (0);
 //BA.debugLineNum = 84;BA.debugLine="Private yScrollPosition As Int = -8";
_yscrollposition = (int) (-8);
 //BA.debugLineNum = 85;BA.debugLine="Private laststring As Boolean = False";
_laststring = __c.False;
 //BA.debugLineNum = 86;BA.debugLine="Private timeGenText2 As Long";
_timegentext2 = 0L;
 //BA.debugLineNum = 87;BA.debugLine="Private isActive As Boolean";
_isactive = false;
 //BA.debugLineNum = 88;BA.debugLine="Private localTickCount As Int = 0";
_localtickcount = (int) (0);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _control(anywheresoftware.b4a.objects.collections.Map _controller) throws Exception{
boolean _state = false;
int _buttonnr = 0;
boolean _buttondir = false;
int _axisnr = 0;
float _val = 0f;
 //BA.debugLineNum = 737;BA.debugLine="Private Sub Control(controller As Map)";
 //BA.debugLineNum = 738;BA.debugLine="If controller.ContainsKey(\"GameStart\") And Game T";
if (_controller.ContainsKey((Object)("GameStart")) && _game) { 
 //BA.debugLineNum = 739;BA.debugLine="Dim state As Boolean = controller.Get(\"GameStart";
_state = BA.ObjectToBoolean(_controller.Get((Object)("GameStart")));
 //BA.debugLineNum = 740;BA.debugLine="If state Then";
if (_state) { 
 //BA.debugLineNum = 741;BA.debugLine="show=True";
_show = __c.True;
 }else {
 //BA.debugLineNum = 743;BA.debugLine="finishApp=True";
_finishapp = __c.True;
 //BA.debugLineNum = 744;BA.debugLine="show=False";
_show = __c.False;
 };
 //BA.debugLineNum = 746;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 749;BA.debugLine="If controller.ContainsKey(\"button\") Then";
if (_controller.ContainsKey((Object)("button"))) { 
 //BA.debugLineNum = 750;BA.debugLine="Dim buttonNR As Int = controller.Get(\"button\")";
_buttonnr = (int)(BA.ObjectToNumber(_controller.Get((Object)("button"))));
 //BA.debugLineNum = 751;BA.debugLine="Dim buttonDIR As Boolean = controller.Get(\"dir\")";
_buttondir = BA.ObjectToBoolean(_controller.Get((Object)("dir")));
 //BA.debugLineNum = 752;BA.debugLine="If SubExists(Target,event&\"_controllerButton\") T";
if (__c.SubExists(ba,_target,_event+"_controllerButton")) { 
 //BA.debugLineNum = 753;BA.debugLine="CallSub3(Target,event&\"_controllerButton\",butto";
__c.CallSubNew3(ba,_target,_event+"_controllerButton",(Object)(_buttonnr),(Object)(_buttondir));
 };
 //BA.debugLineNum = 755;BA.debugLine="If verboseLog Then";
if (_verboselog) { 
 //BA.debugLineNum = 756;BA.debugLine="If buttonDIR Then Logger($\"Button ${buttonNR} d";
if (_buttondir) { 
_logger(("Button "+__c.SmartStringFormatter("",(Object)(_buttonnr))+" down"));}
else {
_logger(("Button "+__c.SmartStringFormatter("",(Object)(_buttonnr))+" up"));};
 };
 //BA.debugLineNum = 758;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 761;BA.debugLine="If controller.ContainsKey(\"axis\") Then";
if (_controller.ContainsKey((Object)("axis"))) { 
 //BA.debugLineNum = 762;BA.debugLine="Dim AxisNR As Int = controller.Get(\"axis\")";
_axisnr = (int)(BA.ObjectToNumber(_controller.Get((Object)("axis"))));
 //BA.debugLineNum = 763;BA.debugLine="Dim val As Float = controller.Get(\"dir\")";
_val = (float)(BA.ObjectToNumber(_controller.Get((Object)("dir"))));
 //BA.debugLineNum = 764;BA.debugLine="If SubExists(Target,event&\"_controllerAxis\") The";
if (__c.SubExists(ba,_target,_event+"_controllerAxis")) { 
 //BA.debugLineNum = 765;BA.debugLine="CallSub3(Target,event&\"_controllerAxis\",AxisNR,";
__c.CallSubNew3(ba,_target,_event+"_controllerAxis",(Object)(_axisnr),(Object)(_val));
 };
 //BA.debugLineNum = 767;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return "";
}
public String  _customcommand(anywheresoftware.b4a.objects.collections.Map _cmd) throws Exception{
 //BA.debugLineNum = 672;BA.debugLine="Public Sub customCommand(cmd As Map)";
 //BA.debugLineNum = 673;BA.debugLine="commandList.Add(cmd)";
_commandlist.Add((Object)(_cmd.getObject()));
 //BA.debugLineNum = 674;BA.debugLine="End Sub";
return "";
}
public String  _download(String _link) throws Exception{
 //BA.debugLineNum = 975;BA.debugLine="Public Sub Download(Link As String)";
 //BA.debugLineNum = 976;BA.debugLine="httpMap=CreateMap(\"type\":\"Download\",\"Link\":Link)";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("Download"),(Object)("Link"),(Object)(_link)});
 //BA.debugLineNum = 977;BA.debugLine="End Sub";
return "";
}
public String  _download2(String _link,String[] _parameters) throws Exception{
 //BA.debugLineNum = 984;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
 //BA.debugLineNum = 985;BA.debugLine="httpMap=CreateMap(\"type\":\"Download2\",\"Link\":Link,";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("Download2"),(Object)("Link"),(Object)(_link),(Object)("Parameters"),(Object)(_parameters)});
 //BA.debugLineNum = 986;BA.debugLine="End Sub";
return "";
}
public String  _drawbmp(int _x,int _y,short[] _bmp,int _width,int _height) throws Exception{
 //BA.debugLineNum = 613;BA.debugLine="Public Sub drawBMP(x As Int,y As Int,bmp() As Shor";
 //BA.debugLineNum = 614;BA.debugLine="commandList.Add(CreateMap(\"type\":\"bmp\",\"x\":x,\"y\":";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("bmp"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("bmp"),(Object)(_bmp),(Object)("width"),(Object)(_width),(Object)("height"),(Object)(_height)}).getObject()));
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return "";
}
public String  _drawcircle(int _x,int _y,int _radius,int[] _color) throws Exception{
 //BA.debugLineNum = 627;BA.debugLine="Public Sub drawCircle(X As Int, Y As Int, Radius A";
 //BA.debugLineNum = 628;BA.debugLine="If Color=Null Then";
if (_color== null) { 
 //BA.debugLineNum = 629;BA.debugLine="commandList.Add(CreateMap(\"type\":\"circle\",\"x\":x,";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("circle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(_systemcolor)}).getObject()));
 }else {
 //BA.debugLineNum = 631;BA.debugLine="commandList.Add(CreateMap(\"type\":\"circle\",\"x\":x,";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("circle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(_color)}).getObject()));
 };
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return "";
}
public String  _drawline(int _x0,int _y0,int _x1,int _y1,int[] _color) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Public Sub drawLine(X0 As Int,Y0 As Int,X1  As Int";
 //BA.debugLineNum = 664;BA.debugLine="If Color=Null Then";
if (_color== null) { 
 //BA.debugLineNum = 665;BA.debugLine="commandList.Add(CreateMap(\"type\":\"line\",\"x0\":X0,";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("line"),(Object)("x0"),(Object)(_x0),(Object)("y0"),(Object)(_y0),(Object)("x1"),(Object)(_x1),(Object)("y1"),(Object)(_y1),(Object)("color"),(Object)(_systemcolor)}).getObject()));
 }else {
 //BA.debugLineNum = 667;BA.debugLine="commandList.Add(CreateMap(\"type\":\"line\",\"x0\":X0,";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("line"),(Object)("x0"),(Object)(_x0),(Object)("y0"),(Object)(_y0),(Object)("x1"),(Object)(_x1),(Object)("y1"),(Object)(_y1),(Object)("color"),(Object)(_color)}).getObject()));
 };
 //BA.debugLineNum = 669;BA.debugLine="End Sub";
return "";
}
public String  _drawpixel(int _x,int _y,int[] _color) throws Exception{
 //BA.debugLineNum = 645;BA.debugLine="Public Sub drawPixel(X As Int,Y As Int,Color() As";
 //BA.debugLineNum = 646;BA.debugLine="If Color=Null Then";
if (_color== null) { 
 //BA.debugLineNum = 647;BA.debugLine="commandList.Add(CreateMap(\"type\":\"pixel\",\"x\":x,\"";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("pixel"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("color"),(Object)(_systemcolor)}).getObject()));
 }else {
 //BA.debugLineNum = 649;BA.debugLine="commandList.Add(CreateMap(\"type\":\"pixel\",\"x\":x,\"";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("pixel"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("color"),(Object)(_color)}).getObject()));
 };
 //BA.debugLineNum = 651;BA.debugLine="End Sub";
return "";
}
public String  _drawrect(int _x,int _y,int _width,int _height,int[] _color) throws Exception{
 //BA.debugLineNum = 654;BA.debugLine="Public Sub drawRect(X As Int,Y As Int,Width  As In";
 //BA.debugLineNum = 655;BA.debugLine="If Color=Null Then";
if (_color== null) { 
 //BA.debugLineNum = 656;BA.debugLine="commandList.Add(CreateMap(\"type\":\"rect\",\"x\":x,\"y";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("rect"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("w"),(Object)(_width),(Object)("h"),(Object)(_height),(Object)("color"),(Object)(_systemcolor)}).getObject()));
 }else {
 //BA.debugLineNum = 658;BA.debugLine="commandList.Add(CreateMap(\"type\":\"rect\",\"x\":x,\"y";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("rect"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("w"),(Object)(_width),(Object)("h"),(Object)(_height),(Object)("color"),(Object)(_color)}).getObject()));
 };
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return "";
}
public String  _drawtext(String _text,int _x,int _y,int[] _color) throws Exception{
 //BA.debugLineNum = 618;BA.debugLine="Public Sub drawText(text As String,x As Int, y As";
 //BA.debugLineNum = 619;BA.debugLine="If Color=Null Then";
if (_color== null) { 
 //BA.debugLineNum = 620;BA.debugLine="commandList.Add(CreateMap(\"type\":\"text\",\"text\":t";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text"),(Object)("text"),(Object)(_text),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("color"),(Object)(_systemcolor)}).getObject()));
 }else {
 //BA.debugLineNum = 622;BA.debugLine="commandList.Add(CreateMap(\"type\":\"text\",\"text\":t";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text"),(Object)("text"),(Object)(_text),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("color"),(Object)(_color)}).getObject()));
 };
 //BA.debugLineNum = 624;BA.debugLine="End Sub";
return "";
}
public String  _externalcommand(anywheresoftware.b4a.objects.collections.Map _cmd) throws Exception{
 //BA.debugLineNum = 771;BA.debugLine="Private Sub externalCommand(cmd As Map)";
 //BA.debugLineNum = 772;BA.debugLine="If SubExists(Target,event&\"_externalCommand\") The";
if (__c.SubExists(ba,_target,_event+"_externalCommand")) { 
 //BA.debugLineNum = 773;BA.debugLine="CallSub2(Target,event&\"_externalCommand\",cmd)";
__c.CallSubNew2(ba,_target,_event+"_externalCommand",(Object)(_cmd));
 };
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return "";
}
public String  _fallingtext(anywheresoftware.b4a.objects.collections.List _framelist,boolean _callfinish) throws Exception{
b4j.example.awtrix._frameobject _frame = null;
int _x = 0;
int _offset = 0;
int _stop = 0;
 //BA.debugLineNum = 1037;BA.debugLine="Public Sub FallingText(FrameList As List,callFinis";
 //BA.debugLineNum = 1038;BA.debugLine="Dim frame As FrameObject = FrameList.Get(numberOf";
_frame = (b4j.example.awtrix._frameobject)(_framelist.Get(_numberofstring));
 //BA.debugLineNum = 1039;BA.debugLine="If nextString Then";
if (_nextstring) { 
 //BA.debugLineNum = 1041;BA.debugLine="If DateTime.now - timeGenText2 > 100 Then";
if (__c.DateTime.getNow()-_timegentext2>100) { 
 //BA.debugLineNum = 1042;BA.debugLine="nextString = False";
_nextstring = __c.False;
 };
 }else if(_waitafterfallingdown>0) { 
 //BA.debugLineNum = 1048;BA.debugLine="If DateTime.now - timeGenText2 > waitAfterFallin";
if (__c.DateTime.getNow()-_timegentext2>_waitafterfallingdown) { 
 //BA.debugLineNum = 1049;BA.debugLine="waitAfterFallingDown = 0";
_waitafterfallingdown = (int) (0);
 };
 }else if(_laststring) { 
 //BA.debugLineNum = 1053;BA.debugLine="laststring = False";
_laststring = __c.False;
 //BA.debugLineNum = 1054;BA.debugLine="finish";
_finish();
 }else {
 //BA.debugLineNum = 1056;BA.debugLine="If  Not (frame.Icon > -1) Then";
if (__c.Not(_frame.Icon /*int*/ >-1)) { 
 //BA.debugLineNum = 1057;BA.debugLine="frame.Icon = 0";
_frame.Icon /*int*/  = (int) (0);
 };
 //BA.debugLineNum = 1060;BA.debugLine="If frame.text.Length=0 Then";
if (_frame.text /*String*/ .length()==0) { 
 //BA.debugLineNum = 1061;BA.debugLine="numberOfString = numberOfString + 1";
_numberofstring = (int) (_numberofstring+1);
 //BA.debugLineNum = 1063;BA.debugLine="If numberOfString > FrameList.Size - 1 Then";
if (_numberofstring>_framelist.getSize()-1) { 
 //BA.debugLineNum = 1064;BA.debugLine="numberOfString = 0";
_numberofstring = (int) (0);
 };
 //BA.debugLineNum = 1066;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1069;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 1070;BA.debugLine="Dim offset As Int";
_offset = 0;
 //BA.debugLineNum = 1071;BA.debugLine="If frame.Icon>0 Then offset = 9 Else offset = 0";
if (_frame.Icon /*int*/ >0) { 
_offset = (int) (9);}
else {
_offset = (int) (0);};
 //BA.debugLineNum = 1073;BA.debugLine="If frame.TextLength+offset<=MatrixWidth Then";
if (_frame.TextLength /*int*/ +_offset<=_matrixwidth) { 
 //BA.debugLineNum = 1074;BA.debugLine="If frame.Icon>0 Then";
if (_frame.Icon /*int*/ >0) { 
 //BA.debugLineNum = 1075;BA.debugLine="x=9";
_x = (int) (9);
 //BA.debugLineNum = 1077;BA.debugLine="drawBMP(0,0,getIcon(frame.Icon),8,8)";
_drawbmp((int) (0),(int) (0),_geticon(_frame.Icon /*int*/ ),(int) (8),(int) (8));
 }else {
 //BA.debugLineNum = 1079;BA.debugLine="x=1";
_x = (int) (1);
 };
 //BA.debugLineNum = 1083;BA.debugLine="drawText(frame.text,x,yScrollPosition,frame.Col";
_drawtext(_frame.text /*String*/ ,_x,_yscrollposition,_frame.color /*int[]*/ );
 //BA.debugLineNum = 1085;BA.debugLine="yScrollPosition=yScrollPosition+1";
_yscrollposition = (int) (_yscrollposition+1);
 //BA.debugLineNum = 1086;BA.debugLine="If yScrollPosition > 1 Then";
if (_yscrollposition>1) { 
 //BA.debugLineNum = 1087;BA.debugLine="yScrollPosition=-8";
_yscrollposition = (int) (-8);
 //BA.debugLineNum = 1088;BA.debugLine="waitAfterFallingDown = 2500";
_waitafterfallingdown = (int) (2500);
 //BA.debugLineNum = 1089;BA.debugLine="timeGenText2 = DateTime.now";
_timegentext2 = __c.DateTime.getNow();
 //BA.debugLineNum = 1090;BA.debugLine="numberOfString = numberOfString + 1";
_numberofstring = (int) (_numberofstring+1);
 //BA.debugLineNum = 1091;BA.debugLine="nextString = True";
_nextstring = __c.True;
 //BA.debugLineNum = 1092;BA.debugLine="If numberOfString > FrameList.Size - 1 Then";
if (_numberofstring>_framelist.getSize()-1) { 
 //BA.debugLineNum = 1093;BA.debugLine="numberOfString = 0";
_numberofstring = (int) (0);
 //BA.debugLineNum = 1094;BA.debugLine="laststring = True";
_laststring = __c.True;
 };
 //BA.debugLineNum = 1097;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 1101;BA.debugLine="If frame.TextLength+offset>MatrixWidth Then";
if (_frame.TextLength /*int*/ +_offset>_matrixwidth) { 
 //BA.debugLineNum = 1102;BA.debugLine="If frame.Icon>0 Then";
if (_frame.Icon /*int*/ >0) { 
 //BA.debugLineNum = 1103;BA.debugLine="x = 9";
_x = (int) (9);
 }else {
 //BA.debugLineNum = 1105;BA.debugLine="x = 1";
_x = (int) (1);
 };
 //BA.debugLineNum = 1107;BA.debugLine="If mscrollposition-38 > 1 Then";
if (_mscrollposition-38>1) { 
 //BA.debugLineNum = 1108;BA.debugLine="If (8-(mscrollposition-38)+1)>=0 Then";
if ((8-(_mscrollposition-38)+1)>=0) { 
 //BA.debugLineNum = 1109;BA.debugLine="If frame.Icon>0 Then";
if (_frame.Icon /*int*/ >0) { 
 //BA.debugLineNum = 1110;BA.debugLine="drawBMP(0-(mscrollposition-38)+1,0,getIcon(f";
_drawbmp((int) (0-(_mscrollposition-38)+1),(int) (0),_geticon(_frame.Icon /*int*/ ),(int) (8),(int) (8));
 };
 };
 //BA.debugLineNum = 1113;BA.debugLine="drawText(frame.text,x-(mscrollposition-39),1,f";
_drawtext(_frame.text /*String*/ ,(int) (_x-(_mscrollposition-39)),(int) (1),_frame.color /*int[]*/ );
 }else {
 //BA.debugLineNum = 1115;BA.debugLine="If frame.Icon>0 Then";
if (_frame.Icon /*int*/ >0) { 
 //BA.debugLineNum = 1116;BA.debugLine="drawBMP(0,0,getIcon(frame.Icon),8,8)";
_drawbmp((int) (0),(int) (0),_geticon(_frame.Icon /*int*/ ),(int) (8),(int) (8));
 };
 //BA.debugLineNum = 1118;BA.debugLine="drawText(frame.text,x,mscrollposition-38,frame";
_drawtext(_frame.text /*String*/ ,_x,(int) (_mscrollposition-38),_frame.color /*int[]*/ );
 };
 //BA.debugLineNum = 1121;BA.debugLine="mscrollposition=mscrollposition+1";
_mscrollposition = (int) (_mscrollposition+1);
 //BA.debugLineNum = 1122;BA.debugLine="If mscrollposition = 40 Then";
if (_mscrollposition==40) { 
 //BA.debugLineNum = 1123;BA.debugLine="waitAfterFallingDown = 1000";
_waitafterfallingdown = (int) (1000);
 //BA.debugLineNum = 1124;BA.debugLine="timeGenText2 = DateTime.now";
_timegentext2 = __c.DateTime.getNow();
 //BA.debugLineNum = 1125;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 1130;BA.debugLine="If frame.TextLength+offset<=MatrixWidth Then";
if (_frame.TextLength /*int*/ +_offset<=_matrixwidth) { 
 //BA.debugLineNum = 1131;BA.debugLine="If mscrollposition - 38 > 1  Then";
if (_mscrollposition-38>1) { 
 //BA.debugLineNum = 1133;BA.debugLine="mscrollposition=MatrixWidth";
_mscrollposition = _matrixwidth;
 //BA.debugLineNum = 1134;BA.debugLine="numberOfString = numberOfString + 1";
_numberofstring = (int) (_numberofstring+1);
 //BA.debugLineNum = 1135;BA.debugLine="timeGenText2 = DateTime.now";
_timegentext2 = __c.DateTime.getNow();
 //BA.debugLineNum = 1136;BA.debugLine="nextString = True";
_nextstring = __c.True;
 //BA.debugLineNum = 1137;BA.debugLine="If numberOfString > FrameList.Size - 1 Then";
if (_numberofstring>_framelist.getSize()-1) { 
 //BA.debugLineNum = 1138;BA.debugLine="numberOfString = 0";
_numberofstring = (int) (0);
 //BA.debugLineNum = 1140;BA.debugLine="laststring = True";
_laststring = __c.True;
 };
 };
 };
 //BA.debugLineNum = 1146;BA.debugLine="If frame.TextLength+offset+1>MatrixWidth Then";
if (_frame.TextLength /*int*/ +_offset+1>_matrixwidth) { 
 //BA.debugLineNum = 1147;BA.debugLine="Dim stop As Int";
_stop = 0;
 //BA.debugLineNum = 1148;BA.debugLine="If frame.Icon>0 Then";
if (_frame.Icon /*int*/ >0) { 
 //BA.debugLineNum = 1149;BA.debugLine="stop = frame.TextLength + 9 + 5";
_stop = (int) (_frame.TextLength /*int*/ +9+5);
 }else {
 //BA.debugLineNum = 1151;BA.debugLine="stop = frame.TextLength + 5";
_stop = (int) (_frame.TextLength /*int*/ +5);
 };
 //BA.debugLineNum = 1154;BA.debugLine="If mscrollposition - 40 > stop  Then";
if (_mscrollposition-40>_stop) { 
 //BA.debugLineNum = 1155;BA.debugLine="mscrollposition=MatrixWidth";
_mscrollposition = _matrixwidth;
 //BA.debugLineNum = 1156;BA.debugLine="numberOfString = numberOfString + 1";
_numberofstring = (int) (_numberofstring+1);
 //BA.debugLineNum = 1157;BA.debugLine="timeGenText2 = DateTime.now";
_timegentext2 = __c.DateTime.getNow();
 //BA.debugLineNum = 1159;BA.debugLine="nextString = True";
_nextstring = __c.True;
 //BA.debugLineNum = 1160;BA.debugLine="If numberOfString > FrameList.Size - 1 Then";
if (_numberofstring>_framelist.getSize()-1) { 
 //BA.debugLineNum = 1161;BA.debugLine="numberOfString = 0";
_numberofstring = (int) (0);
 //BA.debugLineNum = 1162;BA.debugLine="laststring = True";
_laststring = __c.True;
 };
 };
 };
 };
 //BA.debugLineNum = 1168;BA.debugLine="End Sub";
return "";
}
public String  _fill(int[] _color) throws Exception{
 //BA.debugLineNum = 677;BA.debugLine="Public Sub fill(Color() As Int)";
 //BA.debugLineNum = 678;BA.debugLine="If Color=Null Then";
if (_color== null) { 
 //BA.debugLineNum = 679;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fill\",\"color\":";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fill"),(Object)("color"),(Object)(_systemcolor)}).getObject()));
 }else {
 //BA.debugLineNum = 681;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fill\",\"color\":";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fill"),(Object)("color"),(Object)(_color)}).getObject()));
 };
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return "";
}
public String  _fillcircle(int _x,int _y,int _radius,int[] _color) throws Exception{
 //BA.debugLineNum = 636;BA.debugLine="Public Sub fillCircle(X As Int, Y As Int, Radius A";
 //BA.debugLineNum = 637;BA.debugLine="If Color=Null Then";
if (_color== null) { 
 //BA.debugLineNum = 638;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fillCircle\",\"x";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fillCircle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(_systemcolor)}).getObject()));
 }else {
 //BA.debugLineNum = 640;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fillCircle\",\"x";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fillCircle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(_color)}).getObject()));
 };
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return "";
}
public String  _finish() throws Exception{
 //BA.debugLineNum = 707;BA.debugLine="Public Sub finish";
 //BA.debugLineNum = 708;BA.debugLine="finishApp=True";
_finishapp = __c.True;
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return "";
}
public String  _firsttick() throws Exception{
int _iconid = 0;
anywheresoftware.b4a.objects.collections.List _ico = null;
anywheresoftware.b4j.objects.collections.JSONParser _parse = null;
anywheresoftware.b4a.objects.collections.List _bmproot = null;
short[] _bmp = null;
int _i = 0;
 //BA.debugLineNum = 156;BA.debugLine="Private Sub FirstTick";
 //BA.debugLineNum = 157;BA.debugLine="For Each IconID As Int In icoMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _icomap.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_iconid = (int)(BA.ObjectToNumber(group1.Get(index1)));
 //BA.debugLineNum = 158;BA.debugLine="Try";
try { //BA.debugLineNum = 159;BA.debugLine="If icoMap.ContainsKey(IconID) Then";
if (_icomap.ContainsKey((Object)(_iconid))) { 
 //BA.debugLineNum = 160;BA.debugLine="Dim ico As List=icoMap.get(IconID)";
_ico = new anywheresoftware.b4a.objects.collections.List();
_ico = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_icomap.Get((Object)(_iconid))));
 //BA.debugLineNum = 161;BA.debugLine="Dim parse As JSONParser";
_parse = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 162;BA.debugLine="If animCounter.Get(IconID)>ico.Size-1 Then ani";
if ((double)(BA.ObjectToNumber(_animcounter.Get((Object)(_iconid))))>_ico.getSize()-1) { 
_animcounter.Put((Object)(_iconid),(Object)(0));};
 //BA.debugLineNum = 163;BA.debugLine="parse.Initialize(ico.Get(animCounter.Get(IconI";
_parse.Initialize(BA.ObjectToString(_ico.Get((int)(BA.ObjectToNumber(_animcounter.Get((Object)(_iconid)))))));
 //BA.debugLineNum = 164;BA.debugLine="Dim bmproot As List = parse.NextArray";
_bmproot = new anywheresoftware.b4a.objects.collections.List();
_bmproot = _parse.NextArray();
 //BA.debugLineNum = 165;BA.debugLine="Dim bmp(bmproot.Size) As Short";
_bmp = new short[_bmproot.getSize()];
;
 //BA.debugLineNum = 166;BA.debugLine="For i=0 To bmproot.Size-1";
{
final int step10 = 1;
final int limit10 = (int) (_bmproot.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 167;BA.debugLine="bmp(i)=bmproot.Get(i)";
_bmp[_i] = (short)(BA.ObjectToNumber(_bmproot.Get(_i)));
 }
};
 //BA.debugLineNum = 169;BA.debugLine="RenderedIcons.Put(IconID,bmp)";
_renderedicons.Put((Object)(_iconid),(Object)(_bmp));
 //BA.debugLineNum = 170;BA.debugLine="animCounter.put(IconID,animCounter.Get(IconID)";
_animcounter.Put((Object)(_iconid),(Object)((double)(BA.ObjectToNumber(_animcounter.Get((Object)(_iconid))))+1));
 }else {
 //BA.debugLineNum = 172;BA.debugLine="Log(\"IconID\" & IconID  & \"doesnt exists\")";
__c.Log("IconID"+BA.NumberToString(_iconid)+"doesnt exists");
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 175;BA.debugLine="Log(\"Got Error from \" & appName)";
__c.Log("Got Error from "+_appname);
 //BA.debugLineNum = 176;BA.debugLine="Log(\"Error in IconPreloader:\")";
__c.Log("Error in IconPreloader:");
 //BA.debugLineNum = 177;BA.debugLine="Log(\"IconID:\" & IconID)";
__c.Log("IconID:"+BA.NumberToString(_iconid));
 //BA.debugLineNum = 178;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 }
};
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _gensimpleframe(String _text,int _iconid,boolean _moveicon,boolean _repeaticon,int[] _color,boolean _callfinish) throws Exception{
int _offset = 0;
int _x = 0;
 //BA.debugLineNum = 474;BA.debugLine="Public Sub genSimpleFrame(Text As String, iconID A";
 //BA.debugLineNum = 475;BA.debugLine="If Text.Length=0 Then";
if (_text.length()==0) { 
 //BA.debugLineNum = 476;BA.debugLine="finish";
_finish();
 //BA.debugLineNum = 477;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 479;BA.debugLine="calcTextLength(Text)";
_calctextlength(_text);
 //BA.debugLineNum = 480;BA.debugLine="Dim offset As Int";
_offset = 0;
 //BA.debugLineNum = 481;BA.debugLine="If Not(iconID=0) Then offset = 24 Else offset = 3";
if (__c.Not(_iconid==0)) { 
_offset = (int) (24);}
else {
_offset = (int) (32);};
 //BA.debugLineNum = 482;BA.debugLine="If TextLength>offset Then";
if (_textlength>_offset) { 
 //BA.debugLineNum = 483;BA.debugLine="drawText(Text,mscrollposition,1,Color)";
_drawtext(_text,_mscrollposition,(int) (1),_color);
 //BA.debugLineNum = 484;BA.debugLine="mscrollposition=mscrollposition-1";
_mscrollposition = (int) (_mscrollposition-1);
 //BA.debugLineNum = 485;BA.debugLine="If mscrollposition< 0-TextLength  Then";
if (_mscrollposition<0-_textlength) { 
 //BA.debugLineNum = 486;BA.debugLine="If LockApp And callFinish Then";
if (_lockapp && _callfinish) { 
 //BA.debugLineNum = 487;BA.debugLine="finish";
_finish();
 //BA.debugLineNum = 488;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 490;BA.debugLine="mscrollposition=MatrixWidth";
_mscrollposition = _matrixwidth;
 };
 };
 }else {
 //BA.debugLineNum = 494;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 495;BA.debugLine="If TextLength<offset+1 Then";
if (_textlength<_offset+1) { 
 //BA.debugLineNum = 496;BA.debugLine="If Not(iconID=0) Then";
if (__c.Not(_iconid==0)) { 
 //BA.debugLineNum = 497;BA.debugLine="x=(MatrixWidth-TextLength)/2+4";
_x = (int) ((_matrixwidth-_textlength)/(double)2+4);
 }else {
 //BA.debugLineNum = 499;BA.debugLine="x=(MatrixWidth-TextLength)/2";
_x = (int) ((_matrixwidth-_textlength)/(double)2);
 };
 };
 //BA.debugLineNum = 503;BA.debugLine="drawText(Text,x,1,Color)";
_drawtext(_text,_x,(int) (1),_color);
 };
 //BA.debugLineNum = 506;BA.debugLine="If Not(iconID=0) Then";
if (__c.Not(_iconid==0)) { 
 //BA.debugLineNum = 507;BA.debugLine="If moveIcon Then";
if (_moveicon) { 
 //BA.debugLineNum = 508;BA.debugLine="If hideicon=False Then";
if (_hideicon==__c.False) { 
 //BA.debugLineNum = 509;BA.debugLine="If getScrollposition>9 Then";
if (_getscrollposition()>9) { 
 //BA.debugLineNum = 510;BA.debugLine="drawBMP(0,0,getIcon(iconID),8,8)";
_drawbmp((int) (0),(int) (0),_geticon(_iconid),(int) (8),(int) (8));
 }else {
 //BA.debugLineNum = 512;BA.debugLine="If getScrollposition>-8 Then";
if (_getscrollposition()>-8) { 
 //BA.debugLineNum = 513;BA.debugLine="drawBMP(getScrollposition-9,0,getIcon(iconID";
_drawbmp((int) (_getscrollposition()-9),(int) (0),_geticon(_iconid),(int) (8),(int) (8));
 };
 //BA.debugLineNum = 515;BA.debugLine="If mscrollposition<-8 Then";
if (_mscrollposition<-8) { 
 //BA.debugLineNum = 516;BA.debugLine="If RepeatIcon Then";
if (_repeaticon) { 
 //BA.debugLineNum = 517;BA.debugLine="hideicon=False";
_hideicon = __c.False;
 }else {
 //BA.debugLineNum = 519;BA.debugLine="hideicon=True";
_hideicon = __c.True;
 };
 };
 };
 };
 }else {
 //BA.debugLineNum = 526;BA.debugLine="drawBMP(0,0,getIcon(iconID),8,8)";
_drawbmp((int) (0),(int) (0),_geticon(_iconid),(int) (8),(int) (8));
 };
 };
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
return "";
}
public Object  _get(String _settingskey) throws Exception{
 //BA.debugLineNum = 593;BA.debugLine="public Sub get(SettingsKey As String) As Object";
 //BA.debugLineNum = 594;BA.debugLine="If appSettings.ContainsKey(SettingsKey) Then";
if (_appsettings.ContainsKey((Object)(_settingskey))) { 
 //BA.debugLineNum = 595;BA.debugLine="Return appSettings.Get(SettingsKey)";
if (true) return _appsettings.Get((Object)(_settingskey));
 }else {
 //BA.debugLineNum = 597;BA.debugLine="Log(SettingsKey & \" not found\")";
__c.Log(_settingskey+" not found");
 //BA.debugLineNum = 598;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public String  _getauthor() throws Exception{
 //BA.debugLineNum = 839;BA.debugLine="Sub getauthor As String";
 //BA.debugLineNum = 840;BA.debugLine="Return AppAuthor";
if (true) return _appauthor;
 //BA.debugLineNum = 841;BA.debugLine="End Sub";
return "";
}
public String  _getdescription() throws Exception{
 //BA.debugLineNum = 830;BA.debugLine="Sub getdescription As String";
 //BA.debugLineNum = 831;BA.debugLine="Return AppDescription";
if (true) return _appdescription;
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return "";
}
public int  _getduration() throws Exception{
 //BA.debugLineNum = 796;BA.debugLine="Sub getduration As Int";
 //BA.debugLineNum = 797;BA.debugLine="Return Appduration";
if (true) return _appduration;
 //BA.debugLineNum = 798;BA.debugLine="End Sub";
return 0;
}
public short[]  _geticon(int _id) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Public Sub getIcon(ID As Int) As Short()";
 //BA.debugLineNum = 249;BA.debugLine="If RenderedIcons.ContainsKey(ID) Then";
if (_renderedicons.ContainsKey((Object)(_id))) { 
 //BA.debugLineNum = 250;BA.debugLine="Return RenderedIcons.Get(ID)";
if (true) return (short[])(_renderedicons.Get((Object)(_id)));
 }else {
 //BA.debugLineNum = 252;BA.debugLine="If noIconMessage = False Then";
if (_noiconmessage==__c.False) { 
 //BA.debugLineNum = 253;BA.debugLine="Logger(\"Icon \" & ID & \" not found\")";
_logger("Icon "+BA.NumberToString(_id)+" not found");
 //BA.debugLineNum = 254;BA.debugLine="noIconMessage=True";
_noiconmessage = __c.True;
 };
 //BA.debugLineNum = 257;BA.debugLine="Return noIcon";
if (true) return _noicon;
 };
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getmatrix() throws Exception{
 //BA.debugLineNum = 876;BA.debugLine="Sub getmatrix As Map";
 //BA.debugLineNum = 877;BA.debugLine="Return MatrixInfo";
if (true) return _matrixinfo;
 //BA.debugLineNum = 878;BA.debugLine="End Sub";
return null;
}
public int[]  _getmatrixsize() throws Exception{
int[] _size = null;
 //BA.debugLineNum = 891;BA.debugLine="Sub getmatrixSize As Int()";
 //BA.debugLineNum = 892;BA.debugLine="Dim size() As Int = Array As Int(MatrixHeight,Mat";
_size = new int[]{_matrixheight,_matrixwidth};
 //BA.debugLineNum = 893;BA.debugLine="Return size";
if (true) return _size;
 //BA.debugLineNum = 894;BA.debugLine="End Sub";
return null;
}
public String  _getname() throws Exception{
 //BA.debugLineNum = 821;BA.debugLine="Sub getname As String";
 //BA.debugLineNum = 822;BA.debugLine="Return appName";
if (true) return _appname;
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return "";
}
public int[]  _getrgb(String _color) throws Exception{
int[] _res = null;
 //BA.debugLineNum = 1015;BA.debugLine="Private Sub getRGB(Color As String) As Int()";
 //BA.debugLineNum = 1016;BA.debugLine="Dim res(3) As Int";
_res = new int[(int) (3)];
;
 //BA.debugLineNum = 1017;BA.debugLine="res(0) = Bit.ParseInt(Color.SubString2(1,3), 16)";
_res[(int) (0)] = __c.Bit.ParseInt(_color.substring((int) (1),(int) (3)),(int) (16));
 //BA.debugLineNum = 1018;BA.debugLine="res(1) = Bit.ParseInt(Color.SubString2(3,5), 16)";
_res[(int) (1)] = __c.Bit.ParseInt(_color.substring((int) (3),(int) (5)),(int) (16));
 //BA.debugLineNum = 1019;BA.debugLine="res(2) = Bit.ParseInt(Color.SubString2(5,7), 16)";
_res[(int) (2)] = __c.Bit.ParseInt(_color.substring((int) (5),(int) (7)),(int) (16));
 //BA.debugLineNum = 1020;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1021;BA.debugLine="End Sub";
return null;
}
public int  _getscrollposition() throws Exception{
 //BA.debugLineNum = 921;BA.debugLine="Sub getScrollposition As Int";
 //BA.debugLineNum = 922;BA.debugLine="Return mscrollposition";
if (true) return _mscrollposition;
 //BA.debugLineNum = 923;BA.debugLine="End Sub";
return 0;
}
public String  _getserver() throws Exception{
 //BA.debugLineNum = 886;BA.debugLine="Sub getserver As String";
 //BA.debugLineNum = 887;BA.debugLine="Return ServerVersion";
if (true) return _serverversion;
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return "";
}
public long  _getstartedat() throws Exception{
 //BA.debugLineNum = 782;BA.debugLine="Sub getstartedAt As Long";
 //BA.debugLineNum = 783;BA.debugLine="Return startTimestamp";
if (true) return _starttimestamp;
 //BA.debugLineNum = 784;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.List  _gettags() throws Exception{
 //BA.debugLineNum = 787;BA.debugLine="Sub gettags As List";
 //BA.debugLineNum = 788;BA.debugLine="Return Tag";
if (true) return _tag;
 //BA.debugLineNum = 789;BA.debugLine="End Sub";
return null;
}
public String  _gettick() throws Exception{
 //BA.debugLineNum = 857;BA.debugLine="Sub gettick As String";
 //BA.debugLineNum = 858;BA.debugLine="Return TickInterval";
if (true) return BA.NumberToString(_tickinterval);
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return "";
}
public String  _gettoken() throws Exception{
 //BA.debugLineNum = 917;BA.debugLine="Sub getToken As String";
 //BA.debugLineNum = 918;BA.debugLine="Return OAuthToken";
if (true) return _oauthtoken;
 //BA.debugLineNum = 919;BA.debugLine="End Sub";
return "";
}
public String  _getversion() throws Exception{
 //BA.debugLineNum = 848;BA.debugLine="Sub getversion As String";
 //BA.debugLineNum = 849;BA.debugLine="Return AppVersion";
if (true) return _appversion;
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return "";
}
public String  _head(String _link) throws Exception{
 //BA.debugLineNum = 956;BA.debugLine="Public Sub Head(Link As String)";
 //BA.debugLineNum = 957;BA.debugLine="httpMap=CreateMap(\"type\":\"Head\",\"Link\":Link)";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("Head"),(Object)("Link"),(Object)(_link)});
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _class,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 92;BA.debugLine="Public Sub Initialize(class As Object, Eventname A";
 //BA.debugLineNum = 93;BA.debugLine="oauthmap.Initialize";
_oauthmap.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="Tag.Initialize";
_tag.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="httpMap.Initialize";
_httpmap.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="DownloadHeader.Initialize";
_downloadheader.Initialize();
 //BA.debugLineNum = 97;BA.debugLine="event=Eventname";
_event = _eventname;
 //BA.debugLineNum = 98;BA.debugLine="iconList.Initialize";
_iconlist.Initialize();
 //BA.debugLineNum = 99;BA.debugLine="Icon.Initialize";
_icon.Initialize();
 //BA.debugLineNum = 100;BA.debugLine="commandList.Initialize";
_commandlist.Initialize();
 //BA.debugLineNum = 101;BA.debugLine="RenderedIcons.Initialize";
_renderedicons.Initialize();
 //BA.debugLineNum = 102;BA.debugLine="icoMap.Initialize";
_icomap.Initialize();
 //BA.debugLineNum = 103;BA.debugLine="animCounter.Initialize";
_animcounter.Initialize();
 //BA.debugLineNum = 104;BA.debugLine="timermap.Initialize";
_timermap.Initialize();
 //BA.debugLineNum = 105;BA.debugLine="set.Initialize";
_set.Initialize();
 //BA.debugLineNum = 106;BA.debugLine="Menu.Initialize";
_menu.Initialize();
 //BA.debugLineNum = 107;BA.debugLine="MatrixInfo.Initialize";
_matrixinfo.Initialize();
 //BA.debugLineNum = 108;BA.debugLine="MenuList.Initialize";
_menulist.Initialize();
 //BA.debugLineNum = 109;BA.debugLine="Target=class";
_target = _class;
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _initializeoauth(String _authorizeurl,String _tokenurl,String _clientid,String _clientsecret,String _scope) throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="public Sub InitializeOAuth (AuthorizeURL As String";
 //BA.debugLineNum = 912;BA.debugLine="OAuth=True";
_oauth = __c.True;
 //BA.debugLineNum = 913;BA.debugLine="oauthmap=CreateMap(\"AuthorizeURL\":AuthorizeURL,\"T";
_oauthmap = __c.createMap(new Object[] {(Object)("AuthorizeURL"),(Object)(_authorizeurl),(Object)("TokenURL"),(Object)(_tokenurl),(Object)("ClientId"),(Object)(_clientid),(Object)("ClientSecret"),(Object)(_clientsecret),(Object)("Scope"),(Object)(_scope)});
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return "";
}
public Object  _interface(String _function,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
b4j.example.awtrix._jobresponse _res = null;
anywheresoftware.b4a.objects.collections.Map _infos = null;
boolean _isconfigured = false;
anywheresoftware.b4a.objects.collections.Map _m = null;
Object _v = null;
String _s = "";
 //BA.debugLineNum = 263;BA.debugLine="Public Sub interface(function As String, Params As";
 //BA.debugLineNum = 264;BA.debugLine="Select Case function";
switch (BA.switchObjectToInt(_function,"start","downloadCount","startDownload","httpResponse","running","tick","infos","setSettings","getUpdateInterval","setEnabled","getEnable","stop","getIcon","iconList","externalCommand","controller","getMenu","setToken","isReady","buttonPush","shouldShow","poll")) {
case 0: {
 //BA.debugLineNum = 266;BA.debugLine="mscrollposition=MatrixWidth";
_mscrollposition = _matrixwidth;
 //BA.debugLineNum = 267;BA.debugLine="Try";
try { //BA.debugLineNum = 268;BA.debugLine="Appduration = Params.Get(\"AppDuration\")";
_appduration = (int)(BA.ObjectToNumber(_params.Get((Object)("AppDuration"))));
 //BA.debugLineNum = 269;BA.debugLine="If DisplayTime>0 Then";
if (_displaytime>0) { 
 //BA.debugLineNum = 270;BA.debugLine="Appduration=DisplayTime";
_appduration = _displaytime;
 };
 //BA.debugLineNum = 272;BA.debugLine="verboseLog =Params.Get(\"verboseLog\")";
_verboselog = BA.ObjectToBoolean(_params.Get((Object)("verboseLog")));
 //BA.debugLineNum = 273;BA.debugLine="ServerVersion =	Params.Get(\"ServerVersion\")";
_serverversion = BA.ObjectToString(_params.Get((Object)("ServerVersion")));
 //BA.debugLineNum = 274;BA.debugLine="MatrixWidth = Params.Get(\"MatrixWidth\")";
_matrixwidth = (int)(BA.ObjectToNumber(_params.Get((Object)("MatrixWidth"))));
 //BA.debugLineNum = 275;BA.debugLine="MatrixHeight = Params.Get(\"MatrixHeight\")";
_matrixheight = (int)(BA.ObjectToNumber(_params.Get((Object)("MatrixHeight"))));
 //BA.debugLineNum = 276;BA.debugLine="UppercaseLetters = Params.Get(\"UppercaseLetter";
_uppercaseletters = BA.ObjectToBoolean(_params.Get((Object)("UppercaseLetters")));
 //BA.debugLineNum = 277;BA.debugLine="CharMap = Params.Get(\"CharMap\")";
_charmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_params.Get((Object)("CharMap"))));
 //BA.debugLineNum = 278;BA.debugLine="MatrixInfo=Params.Get(\"MatrixInfo\")";
_matrixinfo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_params.Get((Object)("MatrixInfo"))));
 //BA.debugLineNum = 279;BA.debugLine="set.Put(\"interval\",TickInterval)";
_set.Put((Object)("interval"),(Object)(_tickinterval));
 //BA.debugLineNum = 280;BA.debugLine="set.Put(\"needDownload\",NeedDownloads)";
_set.Put((Object)("needDownload"),(Object)(_needdownloads));
 //BA.debugLineNum = 281;BA.debugLine="set.Put(\"DisplayTime\", DisplayTime)";
_set.Put((Object)("DisplayTime"),(Object)(_displaytime));
 //BA.debugLineNum = 282;BA.debugLine="set.Put(\"forceDownload\", forceDown)";
_set.Put((Object)("forceDownload"),(Object)(_forcedown));
 //BA.debugLineNum = 283;BA.debugLine="numberOfString=0";
_numberofstring = (int) (0);
 //BA.debugLineNum = 284;BA.debugLine="If SubExists(Target,event&\"_Started\") Then";
if (__c.SubExists(ba,_target,_event+"_Started")) { 
 //BA.debugLineNum = 285;BA.debugLine="CallSub(Target,event&\"_Started\")";
__c.CallSubNew(ba,_target,_event+"_Started");
 };
 //BA.debugLineNum = 287;BA.debugLine="hideicon=False";
_hideicon = __c.False;
 //BA.debugLineNum = 288;BA.debugLine="isActive=True";
_isactive = __c.True;
 } 
       catch (Exception e27) {
			ba.setLastException(e27); //BA.debugLineNum = 290;BA.debugLine="Log(\"Got Error from \" & appName)";
__c.Log("Got Error from "+_appname);
 //BA.debugLineNum = 291;BA.debugLine="Log(\"Error in start procedure\")";
__c.Log("Error in start procedure");
 //BA.debugLineNum = 292;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 294;BA.debugLine="startTimestamp=DateTime.now";
_starttimestamp = __c.DateTime.getNow();
 //BA.debugLineNum = 295;BA.debugLine="noIconMessage=False";
_noiconmessage = __c.False;
 //BA.debugLineNum = 296;BA.debugLine="If show Then";
if (_show) { 
 //BA.debugLineNum = 297;BA.debugLine="set.Put(\"show\",timesComparative)";
_set.Put((Object)("show"),(Object)(_timescomparative()));
 }else {
 //BA.debugLineNum = 299;BA.debugLine="set.Put(\"show\",show)";
_set.Put((Object)("show"),(Object)(_show));
 };
 //BA.debugLineNum = 301;BA.debugLine="If Regex.IsMatch(\"^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]";
if (__c.Regex.IsMatch("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})",_customcolor)) { 
 //BA.debugLineNum = 302;BA.debugLine="SystemColor=getRGB(customcolor)";
_systemcolor = _getrgb(_customcolor);
 //BA.debugLineNum = 303;BA.debugLine="Log(\"Set CustomColor\")";
__c.Log("Set CustomColor");
 }else {
 //BA.debugLineNum = 305;BA.debugLine="SystemColor = Params.Get(\"SystemColor\")";
_systemcolor = (int[])(_params.Get((Object)("SystemColor")));
 };
 //BA.debugLineNum = 307;BA.debugLine="set.Put(\"isGame\",Game)";
_set.Put((Object)("isGame"),(Object)(_game));
 //BA.debugLineNum = 308;BA.debugLine="set.Put(\"hold\",LockApp)";
_set.Put((Object)("hold"),(Object)(_lockapp));
 //BA.debugLineNum = 309;BA.debugLine="set.Put(\"iconList\",Icon)";
_set.Put((Object)("iconList"),(Object)(_icon.getObject()));
 //BA.debugLineNum = 310;BA.debugLine="Return set";
if (true) return (Object)(_set.getObject());
 break; }
case 1: {
 //BA.debugLineNum = 312;BA.debugLine="Return NeedDownloads";
if (true) return (Object)(_needdownloads);
 break; }
case 2: {
 //BA.debugLineNum = 314;BA.debugLine="httpMap.Initialize";
_httpmap.Initialize();
 //BA.debugLineNum = 315;BA.debugLine="DownloadHeader.Initialize";
_downloadheader.Initialize();
 //BA.debugLineNum = 316;BA.debugLine="mContentType=\"\"";
_mcontenttype = "";
 //BA.debugLineNum = 317;BA.debugLine="If SubExists(Target,event&\"_startDownload\") The";
if (__c.SubExists(ba,_target,_event+"_startDownload")) { 
 //BA.debugLineNum = 318;BA.debugLine="CallSub2(Target,event&\"_startDownload\",Params.";
__c.CallSubNew2(ba,_target,_event+"_startDownload",_params.Get((Object)("jobNr")));
 };
 //BA.debugLineNum = 320;BA.debugLine="If DownloadHeader.Size>0 Then";
if (_downloadheader.getSize()>0) { 
 //BA.debugLineNum = 321;BA.debugLine="httpMap.Put(\"Header\",DownloadHeader)";
_httpmap.Put((Object)("Header"),(Object)(_downloadheader.getObject()));
 };
 //BA.debugLineNum = 323;BA.debugLine="If mContentType.Length>0 Then";
if (_mcontenttype.length()>0) { 
 //BA.debugLineNum = 324;BA.debugLine="httpMap.Put(\"ContentType\",mContentType)";
_httpmap.Put((Object)("ContentType"),(Object)(_mcontenttype));
 };
 //BA.debugLineNum = 326;BA.debugLine="Return httpMap";
if (true) return (Object)(_httpmap.getObject());
 break; }
case 3: {
 //BA.debugLineNum = 328;BA.debugLine="Dim res As JobResponse";
_res = new b4j.example.awtrix._jobresponse();
 //BA.debugLineNum = 329;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 330;BA.debugLine="res.jobNr=Params.Get(\"jobNr\")";
_res.jobNr /*int*/  = (int)(BA.ObjectToNumber(_params.Get((Object)("jobNr"))));
 //BA.debugLineNum = 331;BA.debugLine="res.Success=Params.Get(\"success\")";
_res.Success /*boolean*/  = BA.ObjectToBoolean(_params.Get((Object)("success")));
 //BA.debugLineNum = 332;BA.debugLine="res.ResponseString=Params.Get(\"response\")";
_res.ResponseString /*String*/  = BA.ObjectToString(_params.Get((Object)("response")));
 //BA.debugLineNum = 333;BA.debugLine="res.Stream=Params.Get(\"InputStream\")";
_res.Stream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/  = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(_params.Get((Object)("InputStream"))));
 //BA.debugLineNum = 334;BA.debugLine="If SubExists(Target,event&\"_evalJobResponse\") T";
if (__c.SubExists(ba,_target,_event+"_evalJobResponse")) { 
 //BA.debugLineNum = 335;BA.debugLine="CallSub2(Target,event&\"_evalJobResponse\",res)";
__c.CallSubNew2(ba,_target,_event+"_evalJobResponse",(Object)(_res));
 };
 //BA.debugLineNum = 337;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 break; }
case 4: {
 //BA.debugLineNum = 339;BA.debugLine="startIconRenderer";
_starticonrenderer();
 break; }
case 5: {
 //BA.debugLineNum = 341;BA.debugLine="commandList.Clear";
_commandlist.Clear();
 //BA.debugLineNum = 342;BA.debugLine="If finishApp Then";
if (_finishapp) { 
 //BA.debugLineNum = 343;BA.debugLine="finishApp=False";
_finishapp = __c.False;
 //BA.debugLineNum = 344;BA.debugLine="commandList.Add(CreateMap(\"type\":\"finish\"))";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("finish")}).getObject()));
 }else {
 //BA.debugLineNum = 346;BA.debugLine="If SubExists(Target,event&\"_genFrame\") Then";
if (__c.SubExists(ba,_target,_event+"_genFrame")) { 
 //BA.debugLineNum = 347;BA.debugLine="CallSub(Target,event&\"_genFrame\")'ignore";
__c.CallSubNew(ba,_target,_event+"_genFrame");
 };
 };
 //BA.debugLineNum = 351;BA.debugLine="Return commandList";
if (true) return (Object)(_commandlist.getObject());
 break; }
case 6: {
 //BA.debugLineNum = 353;BA.debugLine="Dim infos As Map";
_infos = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 354;BA.debugLine="infos.Initialize";
_infos.Initialize();
 //BA.debugLineNum = 355;BA.debugLine="Dim isconfigured As Boolean = True";
_isconfigured = __c.True;
 //BA.debugLineNum = 356;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\")";
if (__c.File.Exists(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax")) { 
 //BA.debugLineNum = 357;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(File.Re";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_bc.ConvertBytesToObject(__c.File.ReadBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax"))));
 //BA.debugLineNum = 358;BA.debugLine="For Each v As Object In m.Values";
{
final anywheresoftware.b4a.BA.IterableList group94 = _m.Values();
final int groupLen94 = group94.getSize()
;int index94 = 0;
;
for (; index94 < groupLen94;index94++){
_v = group94.Get(index94);
 //BA.debugLineNum = 359;BA.debugLine="If v=\"null\" Or v=\"\" Then";
if ((_v).equals((Object)("null")) || (_v).equals((Object)(""))) { 
 //BA.debugLineNum = 360;BA.debugLine="isconfigured=False";
_isconfigured = __c.False;
 };
 }
};
 //BA.debugLineNum = 363;BA.debugLine="If OAuth And OAuthToken.Length=0 Then isconfig";
if (_oauth && _oauthtoken.length()==0) { 
_isconfigured = __c.False;};
 };
 //BA.debugLineNum = 365;BA.debugLine="infos.Put(\"isconfigured\",isconfigured)";
_infos.Put((Object)("isconfigured"),(Object)(_isconfigured));
 //BA.debugLineNum = 366;BA.debugLine="If SubExists(Target,event&\"_CustomSetupScreen\")";
if (__c.SubExists(ba,_target,_event+"_CustomSetupScreen")) { 
 //BA.debugLineNum = 367;BA.debugLine="infos.Put(\"CustomSetup\",CallSub(Target,event&\"";
_infos.Put((Object)("CustomSetup"),__c.CallSubNew(ba,_target,_event+"_CustomSetupScreen"));
 };
 //BA.debugLineNum = 369;BA.debugLine="infos.Put(\"AppVersion\",AppVersion)";
_infos.Put((Object)("AppVersion"),(Object)(_appversion));
 //BA.debugLineNum = 370;BA.debugLine="infos.Put(\"tags\",Tag)";
_infos.Put((Object)("tags"),(Object)(_tag.getObject()));
 //BA.debugLineNum = 371;BA.debugLine="infos.Put(\"poll\",poll)";
_infos.Put((Object)("poll"),(Object)(_poll.getObject()));
 //BA.debugLineNum = 372;BA.debugLine="infos.Put(\"oauth\",OAuth)";
_infos.Put((Object)("oauth"),(Object)(_oauth));
 //BA.debugLineNum = 373;BA.debugLine="infos.Put(\"oauthmap\",oauthmap)";
_infos.Put((Object)("oauthmap"),(Object)(_oauthmap.getObject()));
 //BA.debugLineNum = 374;BA.debugLine="infos.Put(\"isGame\",Game)";
_infos.Put((Object)("isGame"),(Object)(_game));
 //BA.debugLineNum = 375;BA.debugLine="infos.Put(\"CoverIcon\",Cover)";
_infos.Put((Object)("CoverIcon"),(Object)(_cover));
 //BA.debugLineNum = 376;BA.debugLine="infos.Put(\"pluginversion\",pluginversion)";
_infos.Put((Object)("pluginversion"),(Object)(_pluginversion));
 //BA.debugLineNum = 377;BA.debugLine="infos.Put(\"author\",AppAuthor)";
_infos.Put((Object)("author"),(Object)(_appauthor));
 //BA.debugLineNum = 378;BA.debugLine="infos.Put(\"howToPLay\",playdescription)";
_infos.Put((Object)("howToPLay"),(Object)(_playdescription));
 //BA.debugLineNum = 379;BA.debugLine="infos.Put(\"description\",AppDescription)";
_infos.Put((Object)("description"),(Object)(_appdescription));
 //BA.debugLineNum = 380;BA.debugLine="infos.Put(\"setupInfos\",SetupInfos)";
_infos.Put((Object)("setupInfos"),(Object)(_setupinfos));
 //BA.debugLineNum = 381;BA.debugLine="infos.Put(\"hidden\",mHidden)";
_infos.Put((Object)("hidden"),(Object)(_mhidden));
 //BA.debugLineNum = 382;BA.debugLine="Return infos";
if (true) return (Object)(_infos.getObject());
 break; }
case 7: {
 //BA.debugLineNum = 384;BA.debugLine="makeSettings";
_makesettings();
 //BA.debugLineNum = 385;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 break; }
case 8: {
 //BA.debugLineNum = 387;BA.debugLine="Return UpdateInterval";
if (true) return (Object)(_updateinterval);
 break; }
case 9: {
 //BA.debugLineNum = 389;BA.debugLine="saveSingleSetting(\"Enabled\",Params.Get(\"Enabled";
_savesinglesetting("Enabled",_params.Get((Object)("Enabled")));
 //BA.debugLineNum = 390;BA.debugLine="makeSettings";
_makesettings();
 break; }
case 10: {
 //BA.debugLineNum = 392;BA.debugLine="Return Enabled";
if (true) return (Object)(_enabled);
 break; }
case 11: {
 //BA.debugLineNum = 394;BA.debugLine="If Game Then";
if (_game) { 
 //BA.debugLineNum = 395;BA.debugLine="finishApp=False";
_finishapp = __c.False;
 //BA.debugLineNum = 396;BA.debugLine="show=False";
_show = __c.False;
 };
 //BA.debugLineNum = 398;BA.debugLine="stopIconRenderer";
_stopiconrenderer();
 //BA.debugLineNum = 399;BA.debugLine="If SubExists(Target,event&\"_Exited\") Then";
if (__c.SubExists(ba,_target,_event+"_Exited")) { 
 //BA.debugLineNum = 400;BA.debugLine="CallSub(Target,event&\"_Exited\")";
__c.CallSubNew(ba,_target,_event+"_Exited");
 };
 //BA.debugLineNum = 402;BA.debugLine="isActive=False";
_isactive = __c.False;
 break; }
case 12: {
 //BA.debugLineNum = 404;BA.debugLine="If SubExists(Target,event&\"_iconRequest\") Then";
if (__c.SubExists(ba,_target,_event+"_iconRequest")) { 
 //BA.debugLineNum = 405;BA.debugLine="CallSub(Target,event&\"_iconRequest\")";
__c.CallSubNew(ba,_target,_event+"_iconRequest");
 };
 //BA.debugLineNum = 407;BA.debugLine="Return CreateMap(\"iconList\":Icon)";
if (true) return (Object)(__c.createMap(new Object[] {(Object)("iconList"),(Object)(_icon.getObject())}).getObject());
 break; }
case 13: {
 //BA.debugLineNum = 409;BA.debugLine="If isActive= False Then addToIconRenderer(Param";
if (_isactive==__c.False) { 
_addtoiconrenderer(_params);};
 break; }
case 14: {
 //BA.debugLineNum = 411;BA.debugLine="externalCommand(Params)";
_externalcommand(_params);
 break; }
case 15: {
 //BA.debugLineNum = 413;BA.debugLine="Control(Params)";
_control(_params);
 break; }
case 16: {
 //BA.debugLineNum = 415;BA.debugLine="Menu.Initialize";
_menu.Initialize();
 //BA.debugLineNum = 416;BA.debugLine="Menu.Put(\"Version\",\"1.6\")";
_menu.Put((Object)("Version"),(Object)("1.6"));
 //BA.debugLineNum = 417;BA.debugLine="Menu.Put(\"Theme\",\"Light Theme\")";
_menu.Put((Object)("Theme"),(Object)("Light Theme"));
 //BA.debugLineNum = 418;BA.debugLine="Menu.Put(\"Items\",MenuList)";
_menu.Put((Object)("Items"),(Object)(_menulist.getObject()));
 //BA.debugLineNum = 419;BA.debugLine="Return Menu";
if (true) return (Object)(_menu.getObject());
 break; }
case 17: {
 //BA.debugLineNum = 421;BA.debugLine="OAuthToken=Params.Get(\"token\")";
_oauthtoken = BA.ObjectToString(_params.Get((Object)("token")));
 break; }
case 18: {
 //BA.debugLineNum = 423;BA.debugLine="If SubExists(Target,event&\"_isReady\") Then";
if (__c.SubExists(ba,_target,_event+"_isReady")) { 
 //BA.debugLineNum = 424;BA.debugLine="Return CallSub(Target,event&\"_isReady\")";
if (true) return __c.CallSubNew(ba,_target,_event+"_isReady");
 }else {
 //BA.debugLineNum = 426;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 };
 break; }
case 19: {
 //BA.debugLineNum = 429;BA.debugLine="If SubExists(Target,event&\"_buttonPush\") Then";
if (__c.SubExists(ba,_target,_event+"_buttonPush")) { 
 //BA.debugLineNum = 430;BA.debugLine="CallSub(Target,event&\"_buttonPush\")";
__c.CallSubNew(ba,_target,_event+"_buttonPush");
 };
 break; }
case 20: {
 //BA.debugLineNum = 433;BA.debugLine="Return show";
if (true) return (Object)(_show);
 break; }
case 21: {
 //BA.debugLineNum = 435;BA.debugLine="Dim s As String=Params.Get(\"sub\")";
_s = BA.ObjectToString(_params.Get((Object)("sub")));
 //BA.debugLineNum = 436;BA.debugLine="If SubExists(Target,event & \"_\" & s) Then";
if (__c.SubExists(ba,_target,_event+"_"+_s)) { 
 //BA.debugLineNum = 437;BA.debugLine="CallSub(Target,event & \"_\" & s)";
__c.CallSubNew(ba,_target,_event+"_"+_s);
 };
 break; }
}
;
 //BA.debugLineNum = 440;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public String  _logger(String _msg) throws Exception{
 //BA.debugLineNum = 730;BA.debugLine="Public Sub Logger(msg As String)";
 //BA.debugLineNum = 731;BA.debugLine="If verboseLog Then";
if (_verboselog) { 
 //BA.debugLineNum = 732;BA.debugLine="DateTime.DateFormat=DateTime.DeviceDefaultTimeFo";
__c.DateTime.setDateFormat(__c.DateTime.getDeviceDefaultTimeFormat());
 //BA.debugLineNum = 733;BA.debugLine="Log(DateTime.Date(DateTime.Now) &\"      \" & appN";
__c.Log(__c.DateTime.Date(__c.DateTime.getNow())+"      "+_appname+":"+__c.CRLF+_msg);
 };
 //BA.debugLineNum = 735;BA.debugLine="End Sub";
return "";
}
public String  _loopsound(int _soundfile) throws Exception{
 //BA.debugLineNum = 696;BA.debugLine="Public Sub LoopSound(soundfile As Int)";
 //BA.debugLineNum = 697;BA.debugLine="commandList.Add(CreateMap(\"type\":\"loopsound\",\"fil";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("loopsound"),(Object)("file"),(Object)(_soundfile)}).getObject()));
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return "";
}
public String  _makesettings() throws Exception{
byte[] _data = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
int _counter = 0;
String _settingskey = "";
 //BA.debugLineNum = 542;BA.debugLine="Public Sub makeSettings";
 //BA.debugLineNum = 543;BA.debugLine="If Game Then show=False";
if (_game) { 
_show = __c.False;};
 //BA.debugLineNum = 544;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\"),a";
if (__c.File.Exists(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax")) { 
 //BA.debugLineNum = 545;BA.debugLine="Dim data() As Byte = File.ReadBytes(File.Combine";
_data = __c.File.ReadBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax");
 //BA.debugLineNum = 546;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(data)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_bc.ConvertBytesToObject(_data)));
 //BA.debugLineNum = 547;BA.debugLine="For Each k As String In appSettings.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _appsettings.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_k = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 548;BA.debugLine="If Not(m.ContainsKey(k)) Then";
if (__c.Not(_m.ContainsKey((Object)(_k)))) { 
 //BA.debugLineNum = 549;BA.debugLine="m.Put(k,appSettings.Get(k))";
_m.Put((Object)(_k),_appsettings.Get((Object)(_k)));
 }else {
 //BA.debugLineNum = 551;BA.debugLine="appSettings.Put(k,m.Get(k))";
_appsettings.Put((Object)(_k),_m.Get((Object)(_k)));
 };
 }
};
 //BA.debugLineNum = 554;BA.debugLine="For Counter = m.Size -1 To 0 Step -1";
{
final int step12 = -1;
final int limit12 = (int) (0);
_counter = (int) (_m.getSize()-1) ;
for (;_counter >= limit12 ;_counter = _counter + step12 ) {
 //BA.debugLineNum = 555;BA.debugLine="Dim SettingsKey As String = m.GetKeyAt(Counter)";
_settingskey = BA.ObjectToString(_m.GetKeyAt(_counter));
 //BA.debugLineNum = 556;BA.debugLine="If Not(SettingsKey=\"UpdateInterval\" Or Settings";
if (__c.Not((_settingskey).equals("UpdateInterval") || (_settingskey).equals("StartTime") || (_settingskey).equals("EndTime") || (_settingskey).equals("DisplayTime") || (_settingskey).equals("Enabled") || (_settingskey).equals("CustomColor"))) { 
 //BA.debugLineNum = 557;BA.debugLine="If Not(appSettings.ContainsKey(SettingsKey)) T";
if (__c.Not(_appsettings.ContainsKey((Object)(_settingskey)))) { 
_m.Remove((Object)(_settingskey));};
 };
 }
};
 //BA.debugLineNum = 560;BA.debugLine="Try";
try { //BA.debugLineNum = 561;BA.debugLine="customcolor=m.Get(\"CustomColor\")";
_customcolor = BA.ObjectToString(_m.Get((Object)("CustomColor")));
 //BA.debugLineNum = 562;BA.debugLine="Enabled=m.Get(\"Enabled\")";
_enabled = BA.ObjectToBoolean(_m.Get((Object)("Enabled")));
 //BA.debugLineNum = 563;BA.debugLine="startTime=m.Get(\"StartTime\")";
_starttime = BA.ObjectToString(_m.Get((Object)("StartTime")));
 //BA.debugLineNum = 564;BA.debugLine="endtime=m.Get(\"EndTime\")";
_endtime = BA.ObjectToString(_m.Get((Object)("EndTime")));
 //BA.debugLineNum = 565;BA.debugLine="UpdateInterval=m.Get(\"UpdateInterval\")";
_updateinterval = (int)(BA.ObjectToNumber(_m.Get((Object)("UpdateInterval"))));
 //BA.debugLineNum = 566;BA.debugLine="DisplayTime=m.Get(\"DisplayTime\")";
_displaytime = (int)(BA.ObjectToNumber(_m.Get((Object)("DisplayTime"))));
 //BA.debugLineNum = 567;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\"";
__c.File.WriteBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax",_bc.ConvertObjectToBytes((Object)(_m.getObject())));
 //BA.debugLineNum = 568;BA.debugLine="If SubExists(Target,event&\"_settingsChanged\") T";
if (__c.SubExists(ba,_target,_event+"_settingsChanged")) { 
 //BA.debugLineNum = 569;BA.debugLine="CallSub(Target,event&\"_settingsChanged\")'ignor";
__c.CallSubNew(ba,_target,_event+"_settingsChanged");
 };
 } 
       catch (Exception e30) {
			ba.setLastException(e30); //BA.debugLineNum = 572;BA.debugLine="Log(\"Got Error from \" & appName)";
__c.Log("Got Error from "+_appname);
 //BA.debugLineNum = 573;BA.debugLine="Log(\"Error while saving settings\")";
__c.Log("Error while saving settings");
 //BA.debugLineNum = 574;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 }else {
 //BA.debugLineNum = 577;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 578;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 579;BA.debugLine="m.Put(\"CustomColor\",\"0\")";
_m.Put((Object)("CustomColor"),(Object)("0"));
 //BA.debugLineNum = 580;BA.debugLine="m.Put(\"UpdateInterval\",UpdateInterval)";
_m.Put((Object)("UpdateInterval"),(Object)(_updateinterval));
 //BA.debugLineNum = 581;BA.debugLine="m.Put(\"StartTime\",\"00:00\")";
_m.Put((Object)("StartTime"),(Object)("00:00"));
 //BA.debugLineNum = 582;BA.debugLine="m.Put(\"EndTime\",\"00:00\")";
_m.Put((Object)("EndTime"),(Object)("00:00"));
 //BA.debugLineNum = 583;BA.debugLine="m.Put(\"DisplayTime\",\"0\")";
_m.Put((Object)("DisplayTime"),(Object)("0"));
 //BA.debugLineNum = 584;BA.debugLine="m.Put(\"Enabled\",True)";
_m.Put((Object)("Enabled"),(Object)(__c.True));
 //BA.debugLineNum = 585;BA.debugLine="For Each k As String In appSettings.Keys";
{
final anywheresoftware.b4a.BA.IterableList group43 = _appsettings.Keys();
final int groupLen43 = group43.getSize()
;int index43 = 0;
;
for (; index43 < groupLen43;index43++){
_k = BA.ObjectToString(group43.Get(index43));
 //BA.debugLineNum = 586;BA.debugLine="m.Put(k,appSettings.Get(k))";
_m.Put((Object)(_k),_appsettings.Get((Object)(_k)));
 }
};
 //BA.debugLineNum = 588;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\")";
__c.File.WriteBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax",_bc.ConvertObjectToBytes((Object)(_m.getObject())));
 };
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return "";
}
public String  _patchbytes(String _link,byte[] _data) throws Exception{
 //BA.debugLineNum = 951;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
 //BA.debugLineNum = 952;BA.debugLine="httpMap=CreateMap(\"type\":\"PatchBytes\",\"Link\":Link";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PatchBytes"),(Object)("Link"),(Object)(_link),(Object)("Data"),(Object)(_data)});
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(String _link,String _text) throws Exception{
 //BA.debugLineNum = 946;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
 //BA.debugLineNum = 947;BA.debugLine="httpMap=CreateMap(\"type\":\"PatchString\",\"Link\":Lin";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PatchString"),(Object)("Link"),(Object)(_link),(Object)("Text"),(Object)(_text)});
 //BA.debugLineNum = 948;BA.debugLine="End Sub";
return "";
}
public String  _playsound(int _soundfile) throws Exception{
 //BA.debugLineNum = 686;BA.debugLine="Public Sub playSound(soundfile As Int)";
 //BA.debugLineNum = 687;BA.debugLine="commandList.Add(CreateMap(\"type\":\"sound\",\"file\":s";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("sound"),(Object)("file"),(Object)(_soundfile)}).getObject()));
 //BA.debugLineNum = 688;BA.debugLine="End Sub";
return "";
}
public String  _polling(boolean _enable,String _subname) throws Exception{
 //BA.debugLineNum = 1004;BA.debugLine="Public Sub polling(enable As Boolean,subname As St";
 //BA.debugLineNum = 1005;BA.debugLine="poll=CreateMap(\"enable\":enable,\"sub\":subname)";
_poll = __c.createMap(new Object[] {(Object)("enable"),(Object)(_enable),(Object)("sub"),(Object)(_subname)});
 //BA.debugLineNum = 1006;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(String _link,byte[] _data) throws Exception{
 //BA.debugLineNum = 931;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
 //BA.debugLineNum = 932;BA.debugLine="httpMap=CreateMap(\"type\":\"PostBytes\",\"Link\":Link,";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PostBytes"),(Object)("Link"),(Object)(_link),(Object)("Data"),(Object)(_data)});
 //BA.debugLineNum = 933;BA.debugLine="End Sub";
return "";
}
public String  _postfile(String _link,String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 969;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
 //BA.debugLineNum = 970;BA.debugLine="httpMap=CreateMap(\"type\":\"PostFile\",\"Link\":Link,\"";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PostFile"),(Object)("Link"),(Object)(_link),(Object)("Dir"),(Object)(_dir),(Object)("FileName"),(Object)(_filename)});
 //BA.debugLineNum = 971;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,Object _files) throws Exception{
 //BA.debugLineNum = 963;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
 //BA.debugLineNum = 964;BA.debugLine="httpMap=CreateMap(\"type\":\"PostMultipart\",\"Link\":L";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PostMultipart"),(Object)("Link"),(Object)(_link),(Object)("NameValues"),(Object)(_namevalues.getObject()),(Object)("Files"),_files});
 //BA.debugLineNum = 965;BA.debugLine="End Sub";
return "";
}
public String  _poststring(String _link,String _text) throws Exception{
 //BA.debugLineNum = 926;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
 //BA.debugLineNum = 927;BA.debugLine="httpMap=CreateMap(\"type\":\"PostString\",\"Link\":Link";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PostString"),(Object)("Link"),(Object)(_link),(Object)("Text"),(Object)(_text)});
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return "";
}
public String  _progressbar(int _percent,int _x,int _y,int _maxlength,int[] _barcolor,int[] _backcolor) throws Exception{
int _progress = 0;
 //BA.debugLineNum = 531;BA.debugLine="Public Sub progressBar(percent As Int, x As Int, y";
 //BA.debugLineNum = 532;BA.debugLine="Dim progress As Int = Min(percent,100)/(100/Min(m";
_progress = (int) (__c.Min(_percent,100)/(double)(100/(double)__c.Min(_maxlength,32)));
 //BA.debugLineNum = 533;BA.debugLine="If Not(backColor = Null) Then";
if (__c.Not(_backcolor== null)) { 
 //BA.debugLineNum = 534;BA.debugLine="drawLine(x,y,maxLength,y,backColor)";
_drawline(_x,_y,_maxlength,_y,_backcolor);
 };
 //BA.debugLineNum = 536;BA.debugLine="If progress>0 Then";
if (_progress>0) { 
 //BA.debugLineNum = 537;BA.debugLine="drawLine(x,y,progress,y,barColor)";
_drawline(_x,_y,_progress,_y,_barcolor);
 };
 //BA.debugLineNum = 539;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(String _link,byte[] _data) throws Exception{
 //BA.debugLineNum = 941;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
 //BA.debugLineNum = 942;BA.debugLine="httpMap=CreateMap(\"type\":\"PutBytes\",\"Link\":Link,\"";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PutBytes"),(Object)("Link"),(Object)(_link),(Object)("Data"),(Object)(_data)});
 //BA.debugLineNum = 943;BA.debugLine="End Sub";
return "";
}
public String  _putstring(String _link,String _text) throws Exception{
 //BA.debugLineNum = 936;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
 //BA.debugLineNum = 937;BA.debugLine="httpMap=CreateMap(\"type\":\"PutString\",\"Link\":Link,";
_httpmap = __c.createMap(new Object[] {(Object)("type"),(Object)("PutString"),(Object)("Link"),(Object)(_link),(Object)("Text"),(Object)(_text)});
 //BA.debugLineNum = 938;BA.debugLine="End Sub";
return "";
}
public int[]  _rainbow() throws Exception{
 //BA.debugLineNum = 712;BA.debugLine="Public Sub rainbow As Int()";
 //BA.debugLineNum = 713;BA.debugLine="colorCounter=colorCounter+1";
_colorcounter = (int) (_colorcounter+1);
 //BA.debugLineNum = 714;BA.debugLine="If colorCounter>255 Then colorCounter=0";
if (_colorcounter>255) { 
_colorcounter = (int) (0);};
 //BA.debugLineNum = 715;BA.debugLine="Return(wheel(colorCounter))";
if (true) return (_wheel(_colorcounter));
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _rainbowlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _colorlist = null;
 //BA.debugLineNum = 1178;BA.debugLine="Public Sub rainbowList() As List";
 //BA.debugLineNum = 1179;BA.debugLine="Dim colorList As List";
_colorlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1180;BA.debugLine="colorList.Initialize()";
_colorlist.Initialize();
 //BA.debugLineNum = 1181;BA.debugLine="colorList.Add(Array As Int(255,0,0))";
_colorlist.Add((Object)(new int[]{(int) (255),(int) (0),(int) (0)}));
 //BA.debugLineNum = 1182;BA.debugLine="colorList.Add(Array As Int(255,127,0))";
_colorlist.Add((Object)(new int[]{(int) (255),(int) (127),(int) (0)}));
 //BA.debugLineNum = 1183;BA.debugLine="colorList.Add(Array As Int(255,255,0))";
_colorlist.Add((Object)(new int[]{(int) (255),(int) (255),(int) (0)}));
 //BA.debugLineNum = 1184;BA.debugLine="colorList.Add(Array As Int(0,255,0))";
_colorlist.Add((Object)(new int[]{(int) (0),(int) (255),(int) (0)}));
 //BA.debugLineNum = 1185;BA.debugLine="colorList.Add(Array As Int(0,0,255))";
_colorlist.Add((Object)(new int[]{(int) (0),(int) (0),(int) (255)}));
 //BA.debugLineNum = 1186;BA.debugLine="colorList.Add(Array As Int(75,0,130))";
_colorlist.Add((Object)(new int[]{(int) (75),(int) (0),(int) (130)}));
 //BA.debugLineNum = 1187;BA.debugLine="colorList.Add(Array As Int(143,0,255))";
_colorlist.Add((Object)(new int[]{(int) (143),(int) (0),(int) (255)}));
 //BA.debugLineNum = 1189;BA.debugLine="Return colorList";
if (true) return _colorlist;
 //BA.debugLineNum = 1190;BA.debugLine="End Sub";
return null;
}
public String  _resetlocaltickcount() throws Exception{
 //BA.debugLineNum = 1173;BA.debugLine="Public Sub resetLocalTickCount";
 //BA.debugLineNum = 1174;BA.debugLine="localTickCount = 0";
_localtickcount = (int) (0);
 //BA.debugLineNum = 1175;BA.debugLine="End Sub";
return "";
}
public String  _savesinglesetting(String _key,Object _value) throws Exception{
byte[] _data = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 602;BA.debugLine="Public Sub saveSingleSetting(key As String, value";
 //BA.debugLineNum = 603;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\"),a";
if (__c.File.Exists(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax")) { 
 //BA.debugLineNum = 604;BA.debugLine="Dim data() As Byte = File.ReadBytes(File.Combine";
_data = __c.File.ReadBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax");
 //BA.debugLineNum = 605;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(data)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_bc.ConvertBytesToObject(_data)));
 //BA.debugLineNum = 606;BA.debugLine="m.Put(key,value)";
_m.Put((Object)(_key),_value);
 //BA.debugLineNum = 607;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\")";
__c.File.WriteBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),_appname+".ax",_bc.ConvertObjectToBytes((Object)(_m.getObject())));
 };
 //BA.debugLineNum = 609;BA.debugLine="End Sub";
return "";
}
public String  _setauthor(String _author) throws Exception{
 //BA.debugLineNum = 843;BA.debugLine="Sub setauthor(author As String)";
 //BA.debugLineNum = 844;BA.debugLine="AppAuthor=author";
_appauthor = _author;
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return "";
}
public String  _setcontenttype(String _contenttype) throws Exception{
 //BA.debugLineNum = 996;BA.debugLine="Public Sub SetContentType(ContentType As String)";
 //BA.debugLineNum = 997;BA.debugLine="mContentType=ContentType";
_mcontenttype = _contenttype;
 //BA.debugLineNum = 998;BA.debugLine="End Sub";
return "";
}
public String  _setcovericon(int _covericon) throws Exception{
 //BA.debugLineNum = 902;BA.debugLine="Sub setcoverIcon(coverIcon As Int)";
 //BA.debugLineNum = 903;BA.debugLine="Cover=coverIcon";
_cover = _covericon;
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return "";
}
public String  _setdescription(String _description) throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub setdescription(description As String)";
 //BA.debugLineNum = 835;BA.debugLine="AppDescription=description";
_appdescription = _description;
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return "";
}
public String  _setdownloads(int _downloads) throws Exception{
 //BA.debugLineNum = 866;BA.debugLine="Sub setdownloads(downloads As Int)";
 //BA.debugLineNum = 867;BA.debugLine="NeedDownloads=downloads";
_needdownloads = _downloads;
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return "";
}
public String  _setforcedownload(boolean _forcedownload) throws Exception{
 //BA.debugLineNum = 806;BA.debugLine="Sub setforceDownload(forceDownload As Boolean)";
 //BA.debugLineNum = 807;BA.debugLine="forceDown=forceDownload";
_forcedown = _forcedownload;
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return "";
}
public String  _setheader(anywheresoftware.b4a.objects.collections.Map _header) throws Exception{
 //BA.debugLineNum = 990;BA.debugLine="Public Sub setHeader(header As Map)";
 //BA.debugLineNum = 991;BA.debugLine="DownloadHeader=header";
_downloadheader = _header;
 //BA.debugLineNum = 992;BA.debugLine="End Sub";
return "";
}
public String  _sethidden(boolean _hide) throws Exception{
 //BA.debugLineNum = 1010;BA.debugLine="Sub setHidden(hide As Boolean)";
 //BA.debugLineNum = 1011;BA.debugLine="mHidden=hide";
_mhidden = _hide;
 //BA.debugLineNum = 1012;BA.debugLine="End Sub";
return "";
}
public String  _sethowtoplay(String _howtoplay) throws Exception{
 //BA.debugLineNum = 897;BA.debugLine="Sub sethowToPlay(howToPlay As String)";
 //BA.debugLineNum = 898;BA.debugLine="playdescription=howToPlay";
_playdescription = _howtoplay;
 //BA.debugLineNum = 899;BA.debugLine="End Sub";
return "";
}
public String  _seticons(anywheresoftware.b4a.objects.collections.List _icons) throws Exception{
 //BA.debugLineNum = 816;BA.debugLine="Sub seticons(icons As List)";
 //BA.debugLineNum = 817;BA.debugLine="Icon=icons";
_icon = _icons;
 //BA.debugLineNum = 818;BA.debugLine="End Sub";
return "";
}
public String  _setisgame(boolean _isgame) throws Exception{
 //BA.debugLineNum = 907;BA.debugLine="Sub setisGame(isGame As Boolean)";
 //BA.debugLineNum = 908;BA.debugLine="Game=isGame";
_game = _isgame;
 //BA.debugLineNum = 909;BA.debugLine="End Sub";
return "";
}
public String  _setlock(boolean _lock) throws Exception{
 //BA.debugLineNum = 811;BA.debugLine="Sub setlock(lock As Boolean)";
 //BA.debugLineNum = 812;BA.debugLine="LockApp=lock";
_lockapp = _lock;
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return "";
}
public String  _setname(String _name) throws Exception{
 //BA.debugLineNum = 825;BA.debugLine="Sub setname(name As String)";
 //BA.debugLineNum = 826;BA.debugLine="appName=name";
_appname = _name;
 //BA.debugLineNum = 827;BA.debugLine="End Sub";
return "";
}
public String  _setsettings(anywheresoftware.b4a.objects.collections.Map _settings) throws Exception{
 //BA.debugLineNum = 881;BA.debugLine="Sub setsettings(settings As Map)";
 //BA.debugLineNum = 882;BA.debugLine="appSettings=settings";
_appsettings = _settings;
 //BA.debugLineNum = 883;BA.debugLine="End Sub";
return "";
}
public String  _setsetupdescription(String _setupdescription) throws Exception{
 //BA.debugLineNum = 871;BA.debugLine="Sub setsetupDescription(setupDescription As String";
 //BA.debugLineNum = 872;BA.debugLine="SetupInfos=setupDescription";
_setupinfos = _setupdescription;
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return "";
}
public String  _setshouldshow(boolean _shouldshow) throws Exception{
 //BA.debugLineNum = 801;BA.debugLine="Sub setshouldShow(shouldShow As Boolean)";
 //BA.debugLineNum = 802;BA.debugLine="show=shouldShow";
_show = _shouldshow;
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return "";
}
public String  _settags(anywheresoftware.b4a.objects.collections.List _tags) throws Exception{
 //BA.debugLineNum = 791;BA.debugLine="Sub settags(Tags As List)";
 //BA.debugLineNum = 792;BA.debugLine="Tag=Tags";
_tag = _tags;
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return "";
}
public String  _settick(String _tick) throws Exception{
 //BA.debugLineNum = 861;BA.debugLine="Sub settick(tick As String)";
 //BA.debugLineNum = 862;BA.debugLine="TickInterval=tick";
_tickinterval = (int)(Double.parseDouble(_tick));
 //BA.debugLineNum = 863;BA.debugLine="End Sub";
return "";
}
public String  _setversion(String _version) throws Exception{
 //BA.debugLineNum = 852;BA.debugLine="Sub setversion(version As String)";
 //BA.debugLineNum = 853;BA.debugLine="AppVersion=version";
_appversion = _version;
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
return "";
}
public int  _showmulticolorfalling(int _iconid,String _text,anywheresoftware.b4a.objects.collections.List _colorlist,boolean _revertdirection) throws Exception{
int _tx = 0;
int _ty = 0;
int[] _c = null;
String[] _textline = null;
int _yoffset = 0;
int _pixellength = 0;
int _frame = 0;
int _rcount = 0;
int _revert = 0;
int _i = 0;
 //BA.debugLineNum = 1264;BA.debugLine="Public Sub showMulticolorFalling(iconId As Int, te";
 //BA.debugLineNum = 1265;BA.debugLine="Dim tx, ty As Int";
_tx = 0;
_ty = 0;
 //BA.debugLineNum = 1266;BA.debugLine="Dim c() As Int";
_c = new int[(int) (0)];
;
 //BA.debugLineNum = 1267;BA.debugLine="Dim textLine() As String = Regex.split(\" \", text)";
_textline = __c.Regex.Split(" ",_text);
 //BA.debugLineNum = 1268;BA.debugLine="Dim yOffset As Int = 8";
_yoffset = (int) (8);
 //BA.debugLineNum = 1269;BA.debugLine="If (iconId>0) Then yOffset = 15";
if ((_iconid>0)) { 
_yoffset = (int) (15);};
 //BA.debugLineNum = 1270;BA.debugLine="Dim pixelLength As Int = (textLine.Length*8) + yO";
_pixellength = (int) ((_textline.length*8)+_yoffset);
 //BA.debugLineNum = 1271;BA.debugLine="Dim frame As Int= localTickCount Mod pixelLength";
_frame = (int) (_localtickcount%_pixellength);
 //BA.debugLineNum = 1272;BA.debugLine="Dim rCount As Int= (localTickCount / pixelLength)";
_rcount = (int) ((_localtickcount/(double)_pixellength));
 //BA.debugLineNum = 1273;BA.debugLine="Dim revert As Int = -1";
_revert = (int) (-1);
 //BA.debugLineNum = 1275;BA.debugLine="If (colorList.Size = 0) Then colorList.Add(System";
if ((_colorlist.getSize()==0)) { 
_colorlist.Add((Object)(_systemcolor));};
 //BA.debugLineNum = 1276;BA.debugLine="If (revertDirection) Then";
if ((_revertdirection)) { 
 //BA.debugLineNum = 1277;BA.debugLine="revert = 1";
_revert = (int) (1);
 //BA.debugLineNum = 1278;BA.debugLine="If (iconId>0) Then yOffset = 19";
if ((_iconid>0)) { 
_yoffset = (int) (19);};
 };
 //BA.debugLineNum = 1281;BA.debugLine="If ((iconId > 0) And (frame < 16)) Then";
if (((_iconid>0) && (_frame<16))) { 
 //BA.debugLineNum = 1282;BA.debugLine="drawBMP(12,revert*(8-frame),getIcon(iconId),8,8)";
_drawbmp((int) (12),(int) (_revert*(8-_frame)),_geticon(_iconid),(int) (8),(int) (8));
 };
 //BA.debugLineNum = 1285;BA.debugLine="For i = 0 To textLine.Length-1";
{
final int step18 = 1;
final int limit18 = (int) (_textline.length-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 1286;BA.debugLine="c = colorList.Get((i+(rCount*textLine.Length)) M";
_c = (int[])(_colorlist.Get((int) ((_i+(_rcount*_textline.length))%_colorlist.getSize())));
 //BA.debugLineNum = 1287;BA.debugLine="tx = (MatrixWidth - calcTextLength(textLine(i)))";
_tx = (int) ((_matrixwidth-_calctextlength(_textline[_i]))/(double)2);
 //BA.debugLineNum = 1288;BA.debugLine="ty = 0 + revert*(-frame + i*8 + yOffset)";
_ty = (int) (0+_revert*(-_frame+_i*8+_yoffset));
 //BA.debugLineNum = 1289;BA.debugLine="drawText(textLine(i), tx, ty, c)";
_drawtext(_textline[_i],_tx,_ty,_c);
 }
};
 //BA.debugLineNum = 1292;BA.debugLine="localTickCount=localTickCount+1";
_localtickcount = (int) (_localtickcount+1);
 //BA.debugLineNum = 1293;BA.debugLine="If localTickCount > pixelLength*colorList.Size Th";
if (_localtickcount>_pixellength*_colorlist.getSize()) { 
 //BA.debugLineNum = 1294;BA.debugLine="localTickCount=0";
_localtickcount = (int) (0);
 };
 //BA.debugLineNum = 1297;BA.debugLine="Return (localTickCount Mod pixelLength)";
if (true) return (int) ((_localtickcount%_pixellength));
 //BA.debugLineNum = 1298;BA.debugLine="End Sub";
return 0;
}
public int  _showmulticolortext(int _iconid,String _text,int _yposition,anywheresoftware.b4a.objects.collections.List _colorlist) throws Exception{
int _tx = 0;
int _tl = 0;
int _maxlength = 0;
int _i = 0;
 //BA.debugLineNum = 1213;BA.debugLine="Public Sub showMulticolorText(iconId As Int, text";
 //BA.debugLineNum = 1214;BA.debugLine="Dim tx, tl As Int";
_tx = 0;
_tl = 0;
 //BA.debugLineNum = 1215;BA.debugLine="Dim maxLength As Int = (calcTextLength(text)+32)";
_maxlength = (int) ((_calctextlength(_text)+32));
 //BA.debugLineNum = 1216;BA.debugLine="If (colorList.Size = 0) Then colorList.Add(System";
if ((_colorlist.getSize()==0)) { 
_colorlist.Add((Object)(_systemcolor));};
 //BA.debugLineNum = 1218;BA.debugLine="If ((iconId=0) And (TextLength <= MatrixWidth)) T";
if (((_iconid==0) && (_textlength<=_matrixwidth))) { 
 //BA.debugLineNum = 1219;BA.debugLine="tx=(MatrixWidth-TextLength)/2";
_tx = (int) ((_matrixwidth-_textlength)/(double)2);
 }else if(((_iconid>0) && (_textlength<=_matrixwidth-8))) { 
 //BA.debugLineNum = 1221;BA.debugLine="tx=(MatrixWidth-TextLength)/2 + 4";
_tx = (int) ((_matrixwidth-_textlength)/(double)2+4);
 }else {
 //BA.debugLineNum = 1223;BA.debugLine="tx = MatrixWidth - (localTickCount Mod maxLength";
_tx = (int) (_matrixwidth-(_localtickcount%_maxlength));
 };
 //BA.debugLineNum = 1226;BA.debugLine="tl = 0";
_tl = (int) (0);
 //BA.debugLineNum = 1227;BA.debugLine="For i = 0 To text.Length-1";
{
final int step12 = 1;
final int limit12 = (int) (_text.length()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 1228;BA.debugLine="drawText(text.CharAt(i), tx+tl , yPosition, colo";
_drawtext(BA.ObjectToString(_text.charAt(_i)),(int) (_tx+_tl),_yposition,(int[])(_colorlist.Get((int) (_i%_colorlist.getSize()))));
 //BA.debugLineNum = 1229;BA.debugLine="tl = tl + calcTextLength(text.CharAt(i))";
_tl = (int) (_tl+_calctextlength(BA.ObjectToString(_text.charAt(_i))));
 }
};
 //BA.debugLineNum = 1232;BA.debugLine="If (iconId > 0) Then";
if ((_iconid>0)) { 
 //BA.debugLineNum = 1233;BA.debugLine="drawLine(8,0,8,8, Array As Int(0,0,0))";
_drawline((int) (8),(int) (0),(int) (8),(int) (8),new int[]{(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 1234;BA.debugLine="drawBMP(0,0, getIcon(iconId),8,8)";
_drawbmp((int) (0),(int) (0),_geticon(_iconid),(int) (8),(int) (8));
 };
 //BA.debugLineNum = 1237;BA.debugLine="localTickCount=localTickCount+1";
_localtickcount = (int) (_localtickcount+1);
 //BA.debugLineNum = 1238;BA.debugLine="If localTickCount > maxLength Then";
if (_localtickcount>_maxlength) { 
 //BA.debugLineNum = 1239;BA.debugLine="localTickCount=0";
_localtickcount = (int) (0);
 };
 //BA.debugLineNum = 1242;BA.debugLine="Return localTickCount";
if (true) return _localtickcount;
 //BA.debugLineNum = 1243;BA.debugLine="End Sub";
return 0;
}
public void  _starticonrenderer() throws Exception{
ResumableSub_startIconRenderer rsub = new ResumableSub_startIconRenderer(this);
rsub.resume(ba, null);
}
public static class ResumableSub_startIconRenderer extends BA.ResumableSub {
public ResumableSub_startIconRenderer(b4j.example.awtrix parent) {
this.parent = parent;
}
b4j.example.awtrix parent;
anywheresoftware.b4a.objects.Timer _k = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 140;BA.debugLine="isRunning=True";
parent._isrunning = parent.__c.True;
 //BA.debugLineNum = 141;BA.debugLine="FirstTick";
parent._firsttick();
 //BA.debugLineNum = 142;BA.debugLine="For Each k As Timer In timermap.Keys";
if (true) break;

case 1:
//for
this.state = 4;
group3 = parent._timermap.Keys();
index3 = 0;
groupLen3 = group3.getSize();
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_k = (anywheresoftware.b4a.objects.Timer)(group3.Get(index3));}
if (true) break;

case 6:
//C
this.state = 5;
index3++;
if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 143;BA.debugLine="k.Enabled=True";
_k.setEnabled(parent.__c.True);
 //BA.debugLineNum = 144;BA.debugLine="Sleep(1)";
parent.__c.Sleep(ba,this,(int) (1));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _stopiconrenderer() throws Exception{
ResumableSub_stopIconRenderer rsub = new ResumableSub_stopIconRenderer(this);
rsub.resume(ba, null);
}
public static class ResumableSub_stopIconRenderer extends BA.ResumableSub {
public ResumableSub_stopIconRenderer(b4j.example.awtrix parent) {
this.parent = parent;
}
b4j.example.awtrix parent;
anywheresoftware.b4a.objects.Timer _k = null;
anywheresoftware.b4a.BA.IterableList group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 149;BA.debugLine="isRunning=False";
parent._isrunning = parent.__c.False;
 //BA.debugLineNum = 150;BA.debugLine="For Each k As Timer In timermap.Keys";
if (true) break;

case 1:
//for
this.state = 4;
group2 = parent._timermap.Keys();
index2 = 0;
groupLen2 = group2.getSize();
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if (index2 < groupLen2) {
this.state = 3;
_k = (anywheresoftware.b4a.objects.Timer)(group2.Get(index2));}
if (true) break;

case 6:
//C
this.state = 5;
index2++;
if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 151;BA.debugLine="k.Enabled=False";
_k.setEnabled(parent.__c.False);
 //BA.debugLineNum = 152;BA.debugLine="Sleep(1)";
parent.__c.Sleep(ba,this,(int) (1));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stopsound(int _soundfile) throws Exception{
 //BA.debugLineNum = 691;BA.debugLine="Public Sub stopSound(soundfile As Int)";
 //BA.debugLineNum = 692;BA.debugLine="commandList.Add(CreateMap(\"type\":\"stopsound\"))";
_commandlist.Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("stopsound")}).getObject()));
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return "";
}
public String  _throwerror(String _message) throws Exception{
 //BA.debugLineNum = 777;BA.debugLine="Public Sub throwError(message As String)";
 //BA.debugLineNum = 778;BA.debugLine="Logger(message)";
_logger(_message);
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return "";
}
public String  _timer_tick() throws Exception{
int _iconid = 0;
anywheresoftware.b4a.objects.collections.List _ico = null;
anywheresoftware.b4j.objects.collections.JSONParser _parse = null;
anywheresoftware.b4a.objects.collections.List _bmproot = null;
short[] _bpm = null;
int _i = 0;
 //BA.debugLineNum = 183;BA.debugLine="Private Sub Timer_Tick";
 //BA.debugLineNum = 184;BA.debugLine="Try";
try { //BA.debugLineNum = 185;BA.debugLine="Dim iconid As Int=timermap.Get(Sender)";
_iconid = (int)(BA.ObjectToNumber(_timermap.Get(__c.Sender(ba))));
 //BA.debugLineNum = 186;BA.debugLine="If icoMap.ContainsKey(iconid) Then";
if (_icomap.ContainsKey((Object)(_iconid))) { 
 //BA.debugLineNum = 187;BA.debugLine="Dim ico As List= icoMap.get(iconid)";
_ico = new anywheresoftware.b4a.objects.collections.List();
_ico = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_icomap.Get((Object)(_iconid))));
 //BA.debugLineNum = 188;BA.debugLine="Dim parse As JSONParser";
_parse = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 189;BA.debugLine="If animCounter.Get(iconid)>ico.Size-1 Then anim";
if ((double)(BA.ObjectToNumber(_animcounter.Get((Object)(_iconid))))>_ico.getSize()-1) { 
_animcounter.Put((Object)(_iconid),(Object)(0));};
 //BA.debugLineNum = 190;BA.debugLine="parse.Initialize(ico.Get(animCounter.Get(iconid";
_parse.Initialize(BA.ObjectToString(_ico.Get((int)(BA.ObjectToNumber(_animcounter.Get((Object)(_iconid)))))));
 //BA.debugLineNum = 191;BA.debugLine="Dim bmproot As List = parse.NextArray";
_bmproot = new anywheresoftware.b4a.objects.collections.List();
_bmproot = _parse.NextArray();
 //BA.debugLineNum = 192;BA.debugLine="Dim bpm(bmproot.Size) As Short";
_bpm = new short[_bmproot.getSize()];
;
 //BA.debugLineNum = 193;BA.debugLine="For i=0 To bmproot.Size-1";
{
final int step10 = 1;
final int limit10 = (int) (_bmproot.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 194;BA.debugLine="bpm(i)=bmproot.Get(i)";
_bpm[_i] = (short)(BA.ObjectToNumber(_bmproot.Get(_i)));
 }
};
 //BA.debugLineNum = 196;BA.debugLine="RenderedIcons.Put(iconid,bpm)";
_renderedicons.Put((Object)(_iconid),(Object)(_bpm));
 //BA.debugLineNum = 197;BA.debugLine="animCounter.put(iconid,animCounter.Get(iconid)+";
_animcounter.Put((Object)(_iconid),(Object)((double)(BA.ObjectToNumber(_animcounter.Get((Object)(_iconid))))+1));
 }else {
 //BA.debugLineNum = 199;BA.debugLine="Logger(\"IconID\" & iconid  & \"doesnt exists\")";
_logger("IconID"+BA.NumberToString(_iconid)+"doesnt exists");
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 202;BA.debugLine="Log(\"Got Error from \" & appName)";
__c.Log("Got Error from "+_appname);
 //BA.debugLineNum = 203;BA.debugLine="Log(\"Error in IconRenderer:\")";
__c.Log("Error in IconRenderer:");
 //BA.debugLineNum = 204;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 205;BA.debugLine="stopIconRenderer";
_stopiconrenderer();
 };
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public boolean  _timescomparative() throws Exception{
String[] _startt = null;
String[] _endt = null;
int _hour = 0;
int _minute = 0;
int _second = 0;
int _now = 0;
int _start = 0;
int _stop = 0;
 //BA.debugLineNum = 113;BA.debugLine="Private Sub timesComparative  As Boolean";
 //BA.debugLineNum = 114;BA.debugLine="Try";
try { //BA.debugLineNum = 115;BA.debugLine="If startTime = endtime Then Return True";
if ((_starttime).equals(_endtime)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 116;BA.debugLine="Dim startT() As String=Regex.Split(\":\",startTime";
_startt = __c.Regex.Split(":",_starttime);
 //BA.debugLineNum = 117;BA.debugLine="Dim EndT() As String=Regex.Split(\":\",endtime)";
_endt = __c.Regex.Split(":",_endtime);
 //BA.debugLineNum = 118;BA.debugLine="Dim hour As Int=DateTime.GetHour(DateTime.Now)";
_hour = __c.DateTime.GetHour(__c.DateTime.getNow());
 //BA.debugLineNum = 119;BA.debugLine="Dim minute As Int=DateTime.GetMinute(DateTime.No";
_minute = __c.DateTime.GetMinute(__c.DateTime.getNow());
 //BA.debugLineNum = 120;BA.debugLine="Dim second As Int=DateTime.GetSecond(DateTime.No";
_second = __c.DateTime.GetSecond(__c.DateTime.getNow());
 //BA.debugLineNum = 121;BA.debugLine="Dim now, start, stop As Int";
_now = 0;
_start = 0;
_stop = 0;
 //BA.debugLineNum = 122;BA.debugLine="now = ((hour * 3600) + (minute * 60) + second)";
_now = (int) (((_hour*3600)+(_minute*60)+_second));
 //BA.debugLineNum = 123;BA.debugLine="start = (startT(0) * 3600) + (startT(1) * 60)";
_start = (int) (((double)(Double.parseDouble(_startt[(int) (0)]))*3600)+((double)(Double.parseDouble(_startt[(int) (1)]))*60));
 //BA.debugLineNum = 124;BA.debugLine="stop = ( EndT(0)* 3600) + (EndT(1) * 60)";
_stop = (int) (((double)(Double.parseDouble(_endt[(int) (0)]))*3600)+((double)(Double.parseDouble(_endt[(int) (1)]))*60));
 //BA.debugLineNum = 125;BA.debugLine="If (start < stop) Then";
if ((_start<_stop)) { 
 //BA.debugLineNum = 126;BA.debugLine="Return (now >= start And now <= stop )";
if (true) return (_now>=_start && _now<=_stop);
 }else {
 //BA.debugLineNum = 128;BA.debugLine="Return (now >= start Or now <= stop)";
if (true) return (_now>=_start || _now<=_stop);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18); //BA.debugLineNum = 131;BA.debugLine="Log(\"Got Error from \" & appName)";
__c.Log("Got Error from "+_appname);
 //BA.debugLineNum = 132;BA.debugLine="Log(\"Error in TimesComparative:\")";
__c.Log("Error in TimesComparative:");
 //BA.debugLineNum = 133;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 134;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return false;
}
public int[]  _wheel(int _wheelpos) throws Exception{
 //BA.debugLineNum = 718;BA.debugLine="Private Sub wheel(Wheelpos As Int) As Int() 'ignor";
 //BA.debugLineNum = 719;BA.debugLine="If(Wheelpos < 85) Then";
if ((_wheelpos<85)) { 
 //BA.debugLineNum = 720;BA.debugLine="Return Array As Int(Wheelpos * 3, 255 - Wheelpos";
if (true) return new int[]{(int) (_wheelpos*3),(int) (255-_wheelpos*3),(int) (0)};
 }else if((_wheelpos<170)) { 
 //BA.debugLineNum = 722;BA.debugLine="Wheelpos =Wheelpos- 85";
_wheelpos = (int) (_wheelpos-85);
 //BA.debugLineNum = 723;BA.debugLine="Return  Array As Int(255 - Wheelpos * 3, 0, Whee";
if (true) return new int[]{(int) (255-_wheelpos*3),(int) (0),(int) (_wheelpos*3)};
 }else {
 //BA.debugLineNum = 725;BA.debugLine="Wheelpos =Wheelpos- 170";
_wheelpos = (int) (_wheelpos-170);
 //BA.debugLineNum = 726;BA.debugLine="Return  Array As Int(0, Wheelpos * 3, 255 - Whee";
if (true) return new int[]{(int) (0),(int) (_wheelpos*3),(int) (255-_wheelpos*3)};
 };
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
