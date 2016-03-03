/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.List;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import tv.twitch.AuthToken;
/*      */ import tv.twitch.Core;
/*      */ import tv.twitch.ErrorCode;
/*      */ import tv.twitch.MessageLevel;
/*      */ import tv.twitch.StandardCoreAPI;
/*      */ import tv.twitch.VideoEncoder;
/*      */ import tv.twitch.broadcast.ArchivingState;
/*      */ import tv.twitch.broadcast.AudioDeviceType;
/*      */ import tv.twitch.broadcast.AudioParams;
/*      */ import tv.twitch.broadcast.ChannelInfo;
/*      */ import tv.twitch.broadcast.DesktopStreamAPI;
/*      */ import tv.twitch.broadcast.EncodingCpuUsage;
/*      */ import tv.twitch.broadcast.FrameBuffer;
/*      */ import tv.twitch.broadcast.GameInfo;
/*      */ import tv.twitch.broadcast.GameInfoList;
/*      */ import tv.twitch.broadcast.IStatCallbacks;
/*      */ import tv.twitch.broadcast.IStreamCallbacks;
/*      */ import tv.twitch.broadcast.IngestList;
/*      */ import tv.twitch.broadcast.IngestServer;
/*      */ import tv.twitch.broadcast.PixelFormat;
/*      */ import tv.twitch.broadcast.StartFlags;
/*      */ import tv.twitch.broadcast.StatType;
/*      */ import tv.twitch.broadcast.Stream;
/*      */ import tv.twitch.broadcast.StreamInfo;
/*      */ import tv.twitch.broadcast.StreamInfoForSetting;
/*      */ import tv.twitch.broadcast.UserInfo;
/*      */ import tv.twitch.broadcast.VideoParams;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class bua
/*      */   implements IStatCallbacks, IStreamCallbacks
/*      */ {
/*  136 */   private static final Logger B = ;
/*      */   
/*  138 */   protected final int a = 30;
/*  139 */   protected final int b = 3;
/*      */   
/*  141 */   private static final qc C = new qc(String.class, 50);
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  147 */   private String D = null;
/*  148 */   protected bud c = null;
/*      */   
/*  150 */   protected String d = "";
/*  151 */   protected String e = "";
/*  152 */   protected String f = "";
/*  153 */   protected boolean g = true;
/*      */   
/*  155 */   protected Core h = null;
/*  156 */   protected Stream i = null;
/*  157 */   protected List j = new ArrayList();
/*  158 */   protected List k = new ArrayList();
/*      */   
/*  160 */   protected boolean l = false;
/*  161 */   protected boolean m = false;
/*  162 */   protected boolean n = false;
/*      */   
/*  164 */   protected buc o = buc.a;
/*      */   
/*  166 */   protected String p = null;
/*  167 */   protected VideoParams q = null;
/*  168 */   protected AudioParams r = null;
/*      */   
/*  170 */   protected IngestList s = new IngestList(new IngestServer[0]);
/*  171 */   protected IngestServer t = null;
/*  172 */   protected AuthToken u = new AuthToken();
/*  173 */   protected ChannelInfo v = new ChannelInfo();
/*  174 */   protected UserInfo w = new UserInfo();
/*  175 */   protected StreamInfo x = new StreamInfo();
/*  176 */   protected ArchivingState y = new ArchivingState();
/*      */   
/*  178 */   protected long z = 0L;
/*  179 */   protected bui A = null;
/*      */   
/*      */ 
/*      */ 
/*      */   private ErrorCode E;
/*      */   
/*      */ 
/*      */ 
/*      */   public void requestAuthTokenCallback(ErrorCode paramErrorCode, AuthToken paramAuthToken)
/*      */   {
/*  189 */     if (ErrorCode.succeeded(paramErrorCode))
/*      */     {
/*      */ 
/*  192 */       this.u = paramAuthToken;
/*  193 */       a(buc.d);
/*      */     }
/*      */     else
/*      */     {
/*  197 */       this.u.data = "";
/*  198 */       a(buc.b);
/*      */       
/*  200 */       String str = ErrorCode.getString(paramErrorCode);
/*  201 */       d(String.format("RequestAuthTokenDoneCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */     
/*      */     try
/*      */     {
/*  206 */       if (this.c != null)
/*      */       {
/*  208 */         this.c.a(paramErrorCode, paramAuthToken);
/*      */       }
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/*  213 */       d(localException.toString());
/*      */     }
/*      */   }
/*      */   
/*      */   public void loginCallback(ErrorCode paramErrorCode, ChannelInfo paramChannelInfo)
/*      */   {
/*  219 */     if (ErrorCode.succeeded(paramErrorCode))
/*      */     {
/*  221 */       this.v = paramChannelInfo;
/*  222 */       a(buc.f);
/*  223 */       this.m = true;
/*      */     }
/*      */     else
/*      */     {
/*  227 */       a(buc.b);
/*  228 */       this.m = false;
/*      */       
/*  230 */       String str = ErrorCode.getString(paramErrorCode);
/*  231 */       d(String.format("LoginCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */     
/*      */     try
/*      */     {
/*  236 */       if (this.c != null)
/*      */       {
/*  238 */         this.c.a(paramErrorCode);
/*      */       }
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/*  243 */       d(localException.toString());
/*      */     }
/*      */   }
/*      */   
/*      */   public void getIngestServersCallback(ErrorCode paramErrorCode, IngestList paramIngestList)
/*      */   {
/*  249 */     if (ErrorCode.succeeded(paramErrorCode))
/*      */     {
/*  251 */       this.s = paramIngestList;
/*      */       
/*      */ 
/*  254 */       this.t = this.s.getDefaultServer();
/*      */       
/*  256 */       a(buc.h);
/*      */       
/*      */       try
/*      */       {
/*  260 */         if (this.c != null)
/*      */         {
/*  262 */           this.c.a(paramIngestList);
/*      */         }
/*      */       }
/*      */       catch (Exception localException)
/*      */       {
/*  267 */         d(localException.toString());
/*      */       }
/*      */     }
/*      */     else
/*      */     {
/*  272 */       String str = ErrorCode.getString(paramErrorCode);
/*  273 */       d(String.format("IngestListCallback got failure: %s", new Object[] { str }));
/*      */       
/*      */ 
/*  276 */       a(buc.e);
/*      */     }
/*      */   }
/*      */   
/*      */   public void getUserInfoCallback(ErrorCode paramErrorCode, UserInfo paramUserInfo)
/*      */   {
/*  282 */     this.w = paramUserInfo;
/*      */     
/*  284 */     if (ErrorCode.failed(paramErrorCode))
/*      */     {
/*  286 */       String str = ErrorCode.getString(paramErrorCode);
/*  287 */       d(String.format("UserInfoDoneCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */   }
/*      */   
/*      */   public void getStreamInfoCallback(ErrorCode paramErrorCode, StreamInfo paramStreamInfo)
/*      */   {
/*  293 */     if (ErrorCode.succeeded(paramErrorCode))
/*      */     {
/*  295 */       this.x = paramStreamInfo;
/*      */       
/*      */       try
/*      */       {
/*  299 */         if (this.c != null)
/*      */         {
/*  301 */           this.c.a(paramStreamInfo);
/*      */         }
/*      */       }
/*      */       catch (Exception localException)
/*      */       {
/*  306 */         d(localException.toString());
/*      */       }
/*      */     }
/*      */     else
/*      */     {
/*  311 */       String str = ErrorCode.getString(paramErrorCode);
/*  312 */       e(String.format("StreamInfoDoneCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */   }
/*      */   
/*      */   public void getArchivingStateCallback(ErrorCode paramErrorCode, ArchivingState paramArchivingState)
/*      */   {
/*  318 */     this.y = paramArchivingState;
/*      */     
/*  320 */     if (ErrorCode.failed(paramErrorCode)) {}
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void runCommercialCallback(ErrorCode paramErrorCode)
/*      */   {
/*  329 */     if (ErrorCode.failed(paramErrorCode))
/*      */     {
/*  331 */       String str = ErrorCode.getString(paramErrorCode);
/*  332 */       e(String.format("RunCommercialCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */   }
/*      */   
/*      */   public void setStreamInfoCallback(ErrorCode paramErrorCode)
/*      */   {
/*  338 */     if (ErrorCode.failed(paramErrorCode))
/*      */     {
/*  340 */       String str = ErrorCode.getString(paramErrorCode);
/*  341 */       e(String.format("SetStreamInfoCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */   }
/*      */   
/*      */   public void getGameNameListCallback(ErrorCode paramErrorCode, GameInfoList paramGameInfoList)
/*      */   {
/*  347 */     if (ErrorCode.failed(paramErrorCode))
/*      */     {
/*  349 */       String str = ErrorCode.getString(paramErrorCode);
/*  350 */       d(String.format("GameNameListCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */     
/*      */     try
/*      */     {
/*  355 */       if (this.c != null)
/*      */       {
/*  357 */         this.c.a(paramErrorCode, paramGameInfoList == null ? new GameInfo[0] : paramGameInfoList.list);
/*      */       }
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/*  362 */       d(localException.toString());
/*      */     }
/*      */   }
/*      */   
/*      */   public void bufferUnlockCallback(long paramLong)
/*      */   {
/*  368 */     FrameBuffer localFrameBuffer = FrameBuffer.lookupBuffer(paramLong);
/*      */     
/*      */ 
/*  371 */     this.k.add(localFrameBuffer);
/*      */   }
/*      */   
/*      */   public void startCallback(ErrorCode paramErrorCode)
/*      */   {
/*  376 */     if (ErrorCode.succeeded(paramErrorCode))
/*      */     {
/*      */       try
/*      */       {
/*  380 */         if (this.c != null)
/*      */         {
/*  382 */           this.c.b();
/*      */         }
/*      */       }
/*      */       catch (Exception localException)
/*      */       {
/*  387 */         d(localException.toString());
/*      */       }
/*      */       
/*  390 */       a(buc.k);
/*      */     }
/*      */     else
/*      */     {
/*  394 */       this.q = null;
/*  395 */       this.r = null;
/*      */       
/*  397 */       a(buc.i);
/*      */       
/*  399 */       String str = ErrorCode.getString(paramErrorCode);
/*  400 */       this.c.c(paramErrorCode);
/*  401 */       d(String.format("startCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */   }
/*      */   
/*      */   public void stopCallback(ErrorCode paramErrorCode)
/*      */   {
/*  407 */     if (ErrorCode.succeeded(paramErrorCode))
/*      */     {
/*  409 */       this.q = null;
/*  410 */       this.r = null;
/*      */       
/*  412 */       M();
/*      */       
/*      */       try
/*      */       {
/*  416 */         if (this.c != null)
/*      */         {
/*  418 */           this.c.c();
/*      */         }
/*      */       }
/*      */       catch (Exception localException)
/*      */       {
/*  423 */         d(localException.toString());
/*      */       }
/*      */       
/*  426 */       if (this.m)
/*      */       {
/*  428 */         a(buc.i);
/*      */       }
/*      */       else
/*      */       {
/*  432 */         a(buc.b);
/*      */       }
/*      */       
/*      */     }
/*      */     else
/*      */     {
/*  438 */       a(buc.i);
/*      */       
/*  440 */       String str = ErrorCode.getString(paramErrorCode);
/*  441 */       d(String.format("stopCallback got failure: %s", new Object[] { str }));
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void sendActionMetaDataCallback(ErrorCode paramErrorCode)
/*      */   {
/*  448 */     if (ErrorCode.failed(paramErrorCode)) {
/*  449 */       e("Failed sending action metadata: " + ErrorCode.getString(paramErrorCode));
/*      */     }
/*      */   }
/*      */   
/*      */   public void sendStartSpanMetaDataCallback(ErrorCode paramErrorCode)
/*      */   {
/*  455 */     if (ErrorCode.failed(paramErrorCode)) {
/*  456 */       e("Failed sending span metadata start: " + ErrorCode.getString(paramErrorCode));
/*      */     }
/*      */   }
/*      */   
/*      */   public void sendEndSpanMetaDataCallback(ErrorCode paramErrorCode)
/*      */   {
/*  462 */     if (ErrorCode.failed(paramErrorCode)) {
/*  463 */       e("Failed sending span metadata end: " + ErrorCode.getString(paramErrorCode));
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void statCallback(StatType paramStatType, long paramLong) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(bud parambud)
/*      */   {
/*  485 */     this.c = parambud;
/*      */   }
/*      */   
/*      */   public boolean b()
/*      */   {
/*  490 */     return this.l;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(String paramString)
/*      */   {
/*  505 */     this.d = paramString;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public StreamInfo j()
/*      */   {
/*  548 */     return this.x;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public ChannelInfo l()
/*      */   {
/*  558 */     return this.v;
/*      */   }
/*      */   
/*      */   public boolean m()
/*      */   {
/*  563 */     return (this.o == buc.k) || (this.o == buc.m);
/*      */   }
/*      */   
/*      */   public boolean n()
/*      */   {
/*  568 */     return this.o == buc.i;
/*      */   }
/*      */   
/*      */   public boolean o()
/*      */   {
/*  573 */     return this.o == buc.n;
/*      */   }
/*      */   
/*      */   public boolean p()
/*      */   {
/*  578 */     return this.o == buc.m;
/*      */   }
/*      */   
/*      */   public boolean q()
/*      */   {
/*  583 */     return this.m;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public IngestServer s()
/*      */   {
/*  597 */     return this.t;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(IngestServer paramIngestServer)
/*      */   {
/*  605 */     this.t = paramIngestServer;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public IngestList t()
/*      */   {
/*  614 */     return this.s;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(float paramFloat)
/*      */   {
/*  626 */     this.i.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, paramFloat);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void b(float paramFloat)
/*      */   {
/*  638 */     this.i.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, paramFloat);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public bui w()
/*      */   {
/*  646 */     return this.A;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long x()
/*      */   {
/*  654 */     return this.i.getStreamTime();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean y()
/*      */   {
/*  664 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public bua()
/*      */   {
/*  671 */     this.h = new Core(new StandardCoreAPI());
/*  672 */     this.i = new Stream(new DesktopStreamAPI());
/*      */   }
/*      */   
/*      */   protected PixelFormat z()
/*      */   {
/*  677 */     return PixelFormat.TTV_PF_RGBA;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean A()
/*      */   {
/*  685 */     if (this.l)
/*      */     {
/*  687 */       return false;
/*      */     }
/*      */     
/*  690 */     ErrorCode localErrorCode = this.h.initialize(this.d, VideoEncoder.TTV_VID_ENC_DEFAULT, System.getProperty("java.library.path"));
/*  691 */     if (!a(localErrorCode))
/*      */     {
/*  693 */       this.E = localErrorCode;
/*  694 */       return false;
/*      */     }
/*      */     
/*  697 */     this.i.setStreamCallbacks(this);
/*      */     
/*  699 */     if (!a(localErrorCode))
/*      */     {
/*  701 */       this.i.setStreamCallbacks(null);
/*  702 */       this.E = localErrorCode;
/*  703 */       return false;
/*      */     }
/*      */     
/*  706 */     localErrorCode = this.h.setTraceLevel(MessageLevel.TTV_ML_ERROR);
/*  707 */     if (!a(localErrorCode))
/*      */     {
/*  709 */       this.i.setStreamCallbacks(null);
/*  710 */       this.E = localErrorCode;
/*  711 */       return false;
/*      */     }
/*      */     
/*  714 */     if (ErrorCode.succeeded(localErrorCode))
/*      */     {
/*  716 */       this.l = true;
/*  717 */       a(buc.b);
/*  718 */       return true;
/*      */     }
/*      */     
/*  721 */     this.E = localErrorCode;
/*  722 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean B()
/*      */   {
/*  730 */     if (!this.l)
/*      */     {
/*  732 */       return true;
/*      */     }
/*  734 */     if (o())
/*      */     {
/*  736 */       return false;
/*      */     }
/*      */     
/*  739 */     this.n = true;
/*      */     
/*  741 */     C();
/*      */     
/*  743 */     this.i.setStreamCallbacks(null);
/*  744 */     this.i.setStatCallbacks(null);
/*      */     
/*  746 */     ErrorCode localErrorCode = this.h.shutdown();
/*  747 */     a(localErrorCode);
/*      */     
/*  749 */     this.l = false;
/*  750 */     this.n = false;
/*  751 */     a(buc.a);
/*      */     
/*  753 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean a(String paramString, AuthToken paramAuthToken)
/*      */   {
/*  802 */     if (o())
/*      */     {
/*  804 */       return false;
/*      */     }
/*      */     
/*  807 */     C();
/*      */     
/*  809 */     if ((paramString == null) || (paramString.isEmpty()))
/*      */     {
/*  811 */       d("Username must be valid");
/*  812 */       return false;
/*      */     }
/*  814 */     if ((paramAuthToken == null) || (paramAuthToken.data == null) || (paramAuthToken.data.isEmpty()))
/*      */     {
/*  816 */       d("Auth token must be valid");
/*  817 */       return false;
/*      */     }
/*      */     
/*  820 */     this.p = paramString;
/*  821 */     this.u = paramAuthToken;
/*      */     
/*  823 */     if (b())
/*      */     {
/*  825 */       a(buc.d);
/*      */     }
/*      */     
/*  828 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean C()
/*      */   {
/*  836 */     if (o())
/*      */     {
/*  838 */       return false;
/*      */     }
/*      */     
/*      */ 
/*  842 */     if (m())
/*      */     {
/*  844 */       this.i.stop(false);
/*      */     }
/*      */     
/*  847 */     this.p = "";
/*  848 */     this.u = new AuthToken();
/*      */     
/*  850 */     if (!this.m)
/*      */     {
/*  852 */       return false;
/*      */     }
/*      */     
/*  855 */     this.m = false;
/*      */     
/*      */ 
/*  858 */     if (!this.n)
/*      */     {
/*      */       try
/*      */       {
/*  862 */         if (this.c != null)
/*      */         {
/*  864 */           this.c.a();
/*      */         }
/*      */       }
/*      */       catch (Exception localException)
/*      */       {
/*  869 */         d(localException.toString());
/*      */       }
/*      */     }
/*      */     
/*  873 */     a(buc.b);
/*      */     
/*  875 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean a(String paramString1, String paramString2, String paramString3)
/*      */   {
/*  887 */     if (!this.m)
/*      */     {
/*  889 */       return false;
/*      */     }
/*      */     
/*  892 */     if ((paramString1 == null) || (paramString1.equals("")))
/*      */     {
/*  894 */       paramString1 = this.p;
/*      */     }
/*      */     
/*  897 */     if (paramString2 == null)
/*      */     {
/*  899 */       paramString2 = "";
/*      */     }
/*      */     
/*  902 */     if (paramString3 == null)
/*      */     {
/*  904 */       paramString3 = "";
/*      */     }
/*      */     
/*  907 */     StreamInfoForSetting localStreamInfoForSetting = new StreamInfoForSetting();
/*  908 */     localStreamInfoForSetting.streamTitle = paramString3;
/*  909 */     localStreamInfoForSetting.gameName = paramString2;
/*      */     
/*  911 */     ErrorCode localErrorCode = this.i.setStreamInfo(this.u, paramString1, localStreamInfoForSetting);
/*  912 */     a(localErrorCode);
/*      */     
/*  914 */     return ErrorCode.succeeded(localErrorCode);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean D()
/*      */   {
/*  923 */     if (!m())
/*      */     {
/*  925 */       return false;
/*      */     }
/*      */     
/*  928 */     ErrorCode localErrorCode = this.i.runCommercial(this.u);
/*  929 */     a(localErrorCode);
/*      */     
/*  931 */     return ErrorCode.succeeded(localErrorCode);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public VideoParams a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
/*      */   {
/*  950 */     int[] arrayOfInt = this.i.getMaxResolution(paramInt1, paramInt2, paramFloat1, paramFloat2);
/*      */     
/*  952 */     VideoParams localVideoParams = new VideoParams();
/*  953 */     localVideoParams.maxKbps = paramInt1;
/*  954 */     localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
/*  955 */     localVideoParams.pixelFormat = z();
/*  956 */     localVideoParams.targetFps = paramInt2;
/*  957 */     localVideoParams.outputWidth = arrayOfInt[0];
/*  958 */     localVideoParams.outputHeight = arrayOfInt[1];
/*  959 */     localVideoParams.disableAdaptiveBitrate = false;
/*  960 */     localVideoParams.verticalFlip = false;
/*      */     
/*  962 */     return localVideoParams;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean a(VideoParams paramVideoParams)
/*      */   {
/* 1005 */     if ((paramVideoParams == null) || (!n()))
/*      */     {
/* 1007 */       return false;
/*      */     }
/*      */     
/* 1010 */     this.q = paramVideoParams.clone();
/*      */     
/*      */ 
/* 1013 */     this.r = new AudioParams();
/* 1014 */     this.r.audioEnabled = ((this.g) && (y()));
/*      */     
/* 1016 */     if (!L())
/*      */     {
/* 1018 */       this.q = null;
/* 1019 */       this.r = null;
/* 1020 */       return false;
/*      */     }
/*      */     
/* 1023 */     ErrorCode localErrorCode = this.i.start(paramVideoParams, this.r, this.t, StartFlags.None, true);
/* 1024 */     if (ErrorCode.failed(localErrorCode))
/*      */     {
/* 1026 */       M();
/*      */       
/* 1028 */       String str = ErrorCode.getString(localErrorCode);
/* 1029 */       d(String.format("Error while starting to broadcast: %s", new Object[] { str }));
/*      */       
/* 1031 */       this.q = null;
/* 1032 */       this.r = null;
/*      */       
/* 1034 */       return false;
/*      */     }
/*      */     
/* 1037 */     a(buc.j);
/*      */     
/* 1039 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean E()
/*      */   {
/* 1048 */     if (!m())
/*      */     {
/* 1050 */       return false;
/*      */     }
/*      */     
/* 1053 */     ErrorCode localErrorCode = this.i.stop(true);
/* 1054 */     if (ErrorCode.failed(localErrorCode))
/*      */     {
/* 1056 */       String str = ErrorCode.getString(localErrorCode);
/* 1057 */       d(String.format("Error while stopping the broadcast: %s", new Object[] { str }));
/* 1058 */       return false;
/*      */     }
/*      */     
/* 1061 */     a(buc.l);
/*      */     
/* 1063 */     return ErrorCode.succeeded(localErrorCode);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean F()
/*      */   {
/* 1072 */     if (!m())
/*      */     {
/* 1074 */       return false;
/*      */     }
/*      */     
/* 1077 */     ErrorCode localErrorCode = this.i.pauseVideo();
/* 1078 */     if (ErrorCode.failed(localErrorCode))
/*      */     {
/*      */ 
/* 1081 */       E();
/*      */       
/* 1083 */       String str = ErrorCode.getString(localErrorCode);
/* 1084 */       d(String.format("Error pausing stream: %s\n", new Object[] { str }));
/*      */     }
/*      */     else
/*      */     {
/* 1088 */       a(buc.m);
/*      */     }
/*      */     
/* 1091 */     return ErrorCode.succeeded(localErrorCode);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean G()
/*      */   {
/* 1100 */     if (!p())
/*      */     {
/* 1102 */       return false;
/*      */     }
/*      */     
/* 1105 */     a(buc.k);
/*      */     
/* 1107 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean a(String paramString1, long paramLong, String paramString2, String paramString3)
/*      */   {
/* 1120 */     ErrorCode localErrorCode = this.i.sendActionMetaData(this.u, paramString1, paramLong, paramString2, paramString3);
/* 1121 */     if (ErrorCode.failed(localErrorCode))
/*      */     {
/* 1123 */       String str = ErrorCode.getString(localErrorCode);
/* 1124 */       d(String.format("Error while sending meta data: %s\n", new Object[] { str }));
/*      */       
/* 1126 */       return false;
/*      */     }
/*      */     
/* 1129 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected void a(buc parambuc)
/*      */   {
/* 1196 */     if (parambuc == this.o)
/*      */     {
/* 1198 */       return;
/*      */     }
/*      */     
/* 1201 */     this.o = parambuc;
/*      */     
/*      */     try
/*      */     {
/* 1205 */       if (this.c != null)
/*      */       {
/* 1207 */         this.c.a(parambuc);
/*      */       }
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/* 1212 */       d(localException.toString());
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void H()
/*      */   {
/* 1222 */     if ((this.i == null) || (!this.l))
/*      */     {
/* 1224 */       return;
/*      */     }
/*      */     
/* 1227 */     ErrorCode localErrorCode = this.i.pollTasks();
/* 1228 */     a(localErrorCode);
/*      */     
/*      */ 
/* 1231 */     if (o())
/*      */     {
/* 1233 */       this.A.j();
/*      */       
/*      */ 
/* 1236 */       if (this.A.e())
/*      */       {
/* 1238 */         this.A = null;
/* 1239 */         a(buc.i);
/*      */       }
/*      */     }
/*      */     String str;
/* 1243 */     switch (bub.a[this.o.ordinal()])
/*      */     {
/*      */ 
/*      */ 
/*      */     case 1: 
/* 1248 */       a(buc.e);
/*      */       
/* 1250 */       localErrorCode = this.i.login(this.u);
/* 1251 */       if (ErrorCode.failed(localErrorCode))
/*      */       {
/* 1253 */         str = ErrorCode.getString(localErrorCode);
/* 1254 */         d(String.format("Error in TTV_Login: %s\n", new Object[] { str })); }
/* 1255 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 2: 
/* 1261 */       a(buc.g);
/*      */       
/* 1263 */       localErrorCode = this.i.getIngestServers(this.u);
/* 1264 */       if (ErrorCode.failed(localErrorCode))
/*      */       {
/* 1266 */         a(buc.f);
/*      */         
/* 1268 */         str = ErrorCode.getString(localErrorCode);
/* 1269 */         d(String.format("Error in TTV_GetIngestServers: %s\n", new Object[] { str })); }
/* 1270 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 3: 
/* 1276 */       a(buc.i);
/*      */       
/*      */ 
/* 1279 */       localErrorCode = this.i.getUserInfo(this.u);
/* 1280 */       if (ErrorCode.failed(localErrorCode))
/*      */       {
/* 1282 */         str = ErrorCode.getString(localErrorCode);
/* 1283 */         d(String.format("Error in TTV_GetUserInfo: %s\n", new Object[] { str }));
/*      */       }
/*      */       
/* 1286 */       I();
/*      */       
/* 1288 */       localErrorCode = this.i.getArchivingState(this.u);
/* 1289 */       if (ErrorCode.failed(localErrorCode))
/*      */       {
/* 1291 */         str = ErrorCode.getString(localErrorCode);
/* 1292 */         d(String.format("Error in TTV_GetArchivingState: %s\n", new Object[] { str })); }
/* 1293 */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 4: 
/*      */     case 5: 
/*      */       break;
/*      */     
/*      */ 
/*      */ 
/*      */     case 6: 
/*      */     case 7: 
/*      */     case 8: 
/*      */     case 9: 
/*      */     case 10: 
/*      */       break;
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */     case 11: 
/*      */     case 12: 
/* 1315 */       I();
/* 1316 */       break;
/*      */     }
/*      */     
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected void I()
/*      */   {
/* 1327 */     long l1 = System.nanoTime();
/* 1328 */     long l2 = (l1 - this.z) / 1000000000L;
/*      */     
/*      */ 
/* 1331 */     if (l2 < 30L)
/*      */     {
/* 1333 */       return;
/*      */     }
/*      */     
/* 1336 */     this.z = l1;
/*      */     
/* 1338 */     ErrorCode localErrorCode = this.i.getStreamInfo(this.u, this.p);
/* 1339 */     if (ErrorCode.failed(localErrorCode))
/*      */     {
/* 1341 */       String str = ErrorCode.getString(localErrorCode);
/* 1342 */       d(String.format("Error in TTV_GetStreamInfo: %s", new Object[] { str }));
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public bui J()
/*      */   {
/* 1355 */     if ((!n()) || (this.s == null))
/*      */     {
/* 1357 */       return null;
/*      */     }
/*      */     
/* 1360 */     if (o())
/*      */     {
/* 1362 */       return null;
/*      */     }
/*      */     
/* 1365 */     this.A = new bui(this.i, this.s);
/* 1366 */     this.A.i();
/*      */     
/* 1368 */     a(buc.n);
/*      */     
/* 1370 */     return this.A;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean L()
/*      */   {
/* 1390 */     for (int i1 = 0; i1 < 3; i1++)
/*      */     {
/* 1392 */       FrameBuffer localFrameBuffer = this.i.allocateFrameBuffer(this.q.outputWidth * this.q.outputHeight * 4);
/* 1393 */       if (!localFrameBuffer.getIsValid())
/*      */       {
/* 1395 */         d(String.format("Error while allocating frame buffer", new Object[0]));
/* 1396 */         return false;
/*      */       }
/*      */       
/* 1399 */       this.j.add(localFrameBuffer);
/* 1400 */       this.k.add(localFrameBuffer);
/*      */     }
/*      */     
/* 1403 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */   protected void M()
/*      */   {
/* 1409 */     for (int i1 = 0; i1 < this.j.size(); i1++)
/*      */     {
/* 1411 */       FrameBuffer localFrameBuffer = (FrameBuffer)this.j.get(i1);
/* 1412 */       localFrameBuffer.free();
/*      */     }
/*      */     
/* 1415 */     this.k.clear();
/* 1416 */     this.j.clear();
/*      */   }
/*      */   
/*      */   public FrameBuffer N()
/*      */   {
/* 1421 */     if (this.k.size() == 0)
/*      */     {
/* 1423 */       d(String.format("Out of free buffers, this should never happen", new Object[0]));
/* 1424 */       return null;
/*      */     }
/*      */     
/* 1427 */     FrameBuffer localFrameBuffer = (FrameBuffer)this.k.get(this.k.size() - 1);
/* 1428 */     this.k.remove(this.k.size() - 1);
/*      */     
/* 1430 */     return localFrameBuffer;
/*      */   }
/*      */   
/*      */   public void a(FrameBuffer paramFrameBuffer)
/*      */   {
/*      */     try {
/* 1436 */       this.i.captureFrameBuffer_ReadPixels(paramFrameBuffer);
/*      */     } catch (Throwable localThrowable) {
/* 1438 */       b localb = b.a(localThrowable, "Trying to submit a frame to Twitch");
/* 1439 */       k localk = localb.a("Broadcast State");
/* 1440 */       localk.a("Last reported errors", Arrays.toString(C.c()));
/* 1441 */       localk.a("Buffer", paramFrameBuffer);
/* 1442 */       localk.a("Free buffer count", Integer.valueOf(this.k.size()));
/* 1443 */       localk.a("Capture buffer count", Integer.valueOf(this.j.size()));
/* 1444 */       throw new s(localb);
/*      */     }
/*      */   }
/*      */   
/*      */   public ErrorCode b(FrameBuffer paramFrameBuffer)
/*      */   {
/* 1450 */     if (p())
/*      */     {
/* 1452 */       G();
/*      */     }
/* 1454 */     else if (!m())
/*      */     {
/* 1456 */       return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
/*      */     }
/*      */     
/* 1459 */     ErrorCode localErrorCode = this.i.submitVideoFrame(paramFrameBuffer);
/*      */     
/*      */ 
/* 1462 */     if (localErrorCode != ErrorCode.TTV_EC_SUCCESS)
/*      */     {
/* 1464 */       String str = ErrorCode.getString(localErrorCode);
/* 1465 */       if (ErrorCode.succeeded(localErrorCode))
/*      */       {
/* 1467 */         e(String.format("Warning in SubmitTexturePointer: %s\n", new Object[] { str }));
/*      */       }
/*      */       else
/*      */       {
/* 1471 */         d(String.format("Error in SubmitTexturePointer: %s\n", new Object[] { str }));
/*      */         
/*      */ 
/* 1474 */         E();
/*      */       }
/*      */       
/* 1477 */       if (this.c != null)
/*      */       {
/* 1479 */         this.c.b(localErrorCode);
/*      */       }
/*      */     }
/*      */     
/* 1483 */     return localErrorCode;
/*      */   }
/*      */   
/*      */   protected boolean a(ErrorCode paramErrorCode)
/*      */   {
/* 1488 */     if (ErrorCode.failed(paramErrorCode))
/*      */     {
/* 1490 */       d(ErrorCode.getString(paramErrorCode));
/* 1491 */       return false;
/*      */     }
/*      */     
/* 1494 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected void d(String paramString)
/*      */   {
/* 1503 */     this.D = paramString;
/* 1504 */     C.a("<Error> " + paramString);
/* 1505 */     B.error(buo.a, "[Broadcast controller] {}", new Object[] { paramString });
/*      */   }
/*      */   
/*      */   protected void e(String paramString)
/*      */   {
/* 1510 */     C.a("<Warning> " + paramString);
/* 1511 */     B.warn(buo.a, "[Broadcast controller] {}", new Object[] { paramString });
/*      */   }
/*      */   
/*      */   public ErrorCode P() {
/* 1515 */     return this.E;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */