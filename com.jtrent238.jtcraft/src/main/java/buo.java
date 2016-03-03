/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.Marker;
/*     */ import org.apache.logging.log4j.MarkerManager;
/*     */ import org.apache.logging.log4j.core.helpers.Strings;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import tv.twitch.AuthToken;
/*     */ import tv.twitch.ErrorCode;
/*     */ import tv.twitch.broadcast.ChannelInfo;
/*     */ import tv.twitch.broadcast.EncodingCpuUsage;
/*     */ import tv.twitch.broadcast.FrameBuffer;
/*     */ import tv.twitch.broadcast.GameInfo;
/*     */ import tv.twitch.broadcast.IngestList;
/*     */ import tv.twitch.broadcast.IngestServer;
/*     */ import tv.twitch.broadcast.StreamInfo;
/*     */ import tv.twitch.broadcast.VideoParams;
/*     */ import tv.twitch.chat.ChatMessage;
/*     */ import tv.twitch.chat.ChatUserInfo;
/*     */ import tv.twitch.chat.ChatUserMode;
/*     */ import tv.twitch.chat.ChatUserSubscription;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class buo
/*     */   implements bud, buh, buk, bum
/*     */ {
/*  42 */   private static final Logger b = ;
/*  43 */   public static final Marker a = MarkerManager.getMarker("STREAM");
/*     */   
/*     */   private final bua c;
/*     */   
/*     */   private final bue d;
/*     */   
/*     */   private final bao e;
/*     */   
/*  51 */   private final fj f = new fq("Twitch");
/*  52 */   private final Map g = Maps.newHashMap();
/*     */   private bmg h;
/*     */   private boolean i;
/*  55 */   private int j = 30;
/*  56 */   private long k = 0L;
/*  57 */   private boolean l = false;
/*     */   private boolean m;
/*     */   private boolean n;
/*     */   private boolean o;
/*  61 */   private bun p = bun.a;
/*     */   private static boolean q;
/*     */   
/*  64 */   public buo(bao parambao, String paramString) { this.e = parambao;
/*  65 */     this.c = new bua();
/*  66 */     this.d = new bue();
/*     */     
/*  68 */     this.c.a(this);
/*  69 */     this.d.a(this);
/*     */     
/*  71 */     this.c.a("nmt37qblda36pvonovdkbopzfzw3wlq");
/*  72 */     this.d.a("nmt37qblda36pvonovdkbopzfzw3wlq");
/*     */     
/*  74 */     this.f.b().a(a.f);
/*     */     
/*  76 */     if ((Strings.isNotEmpty(paramString)) && (buu.n)) {
/*  77 */       bup localbup = new bup(this, "Twitch authenticator", paramString);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       localbup.setDaemon(true);
/* 114 */       localbup.start();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   static
/*     */   {
/*     */     try
/*     */     {
/* 124 */       if (u.a() == v.c) {
/* 125 */         System.loadLibrary("avutil-ttv-51");
/* 126 */         System.loadLibrary("swresample-ttv-0");
/* 127 */         System.loadLibrary("libmp3lame-ttv");
/*     */         
/* 129 */         if (System.getProperty("os.arch").contains("64")) {
/* 130 */           System.loadLibrary("libmfxsw64");
/*     */         } else {
/* 132 */           System.loadLibrary("libmfxsw32");
/*     */         }
/*     */       }
/* 135 */       q = true;
/*     */     } catch (Throwable localThrowable) {
/* 137 */       q = false;
/*     */     }
/*     */   }
/*     */   
/*     */   public void i()
/*     */   {
/* 143 */     b.debug(a, "Shutdown streaming");
/* 144 */     this.c.B();
/* 145 */     this.d.m();
/*     */   }
/*     */   
/*     */   public void j()
/*     */   {
/* 150 */     int i1 = this.e.u.R;
/* 151 */     bug localbug = this.d.j();
/*     */     
/* 153 */     if (i1 == 2) {
/* 154 */       if (localbug == bug.d) {
/* 155 */         b.debug(a, "Disconnecting from twitch chat per user options");
/* 156 */         this.d.l();
/*     */       }
/* 158 */     } else if (i1 == 1) {
/* 159 */       if (((localbug == bug.e) || (localbug == bug.a)) && (this.c.q())) {
/* 160 */         b.debug(a, "Connecting to twitch chat per user options");
/* 161 */         I();
/*     */       }
/* 163 */     } else if (i1 == 0) {
/* 164 */       if (((localbug == bug.e) || (localbug == bug.a)) && (n())) {
/* 165 */         b.debug(a, "Connecting to twitch chat as user is streaming");
/* 166 */         I();
/* 167 */       } else if ((localbug == bug.d) && (!n())) {
/* 168 */         b.debug(a, "Disconnecting from twitch chat as user is no longer streaming");
/* 169 */         this.d.l();
/*     */       }
/*     */     }
/*     */     
/* 173 */     this.c.H();
/* 174 */     this.d.n();
/*     */   }
/*     */   
/*     */   protected void I() {
/* 178 */     bug localbug = this.d.j();
/* 179 */     String str = this.c.l().name;
/*     */     
/* 181 */     if (localbug == bug.a) {
/* 182 */       this.d.f(str);
/* 183 */       this.d.c = str;
/* 184 */     } else if (localbug == bug.e) {
/* 185 */       this.d.d(str);
/*     */     } else {
/* 187 */       b.warn("Invalid twitch chat state {}", new Object[] { localbug });
/*     */     }
/*     */   }
/*     */   
/*     */   public void k()
/*     */   {
/* 193 */     if ((!this.c.m()) || (this.c.p())) {
/* 194 */       return;
/*     */     }
/*     */     
/* 197 */     long l1 = System.nanoTime();
/* 198 */     long l2 = 1000000000 / this.j;
/*     */     
/* 200 */     long l3 = l1 - this.k;
/* 201 */     int i1 = l3 >= l2 ? 1 : 0;
/*     */     
/* 203 */     if (i1 != 0) {
/* 204 */       FrameBuffer localFrameBuffer = this.c.N();
/*     */       
/* 206 */       bmg localbmg = this.e.a();
/*     */       
/* 208 */       this.h.a(true);
/*     */       
/* 210 */       GL11.glMatrixMode(5889);
/* 211 */       GL11.glPushMatrix();
/* 212 */       GL11.glLoadIdentity();
/*     */       
/* 214 */       GL11.glOrtho(0.0D, this.h.c, this.h.d, 0.0D, 1000.0D, 3000.0D);
/* 215 */       GL11.glMatrixMode(5888);
/* 216 */       GL11.glPushMatrix();
/* 217 */       GL11.glLoadIdentity();
/*     */       
/* 219 */       GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/* 220 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/* 222 */       GL11.glViewport(0, 0, this.h.c, this.h.d);
/*     */       
/* 224 */       GL11.glEnable(3553);
/* 225 */       GL11.glDisable(3008);
/* 226 */       GL11.glDisable(3042);
/*     */       
/* 228 */       float f1 = this.h.c;
/* 229 */       float f2 = this.h.d;
/* 230 */       float f3 = localbmg.c / localbmg.a;
/* 231 */       float f4 = localbmg.d / localbmg.b;
/*     */       
/* 233 */       localbmg.c();
/* 234 */       GL11.glTexParameterf(3553, 10241, 9729.0F);
/* 235 */       GL11.glTexParameterf(3553, 10240, 9729.0F);
/*     */       
/* 237 */       bmh localbmh = bmh.a;
/* 238 */       localbmh.b();
/* 239 */       localbmh.a(0.0D, f2, 0.0D, 0.0D, f4);
/* 240 */       localbmh.a(f1, f2, 0.0D, f3, f4);
/* 241 */       localbmh.a(f1, 0.0D, 0.0D, f3, 0.0D);
/* 242 */       localbmh.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 243 */       localbmh.a();
/*     */       
/* 245 */       localbmg.d();
/*     */       
/* 247 */       GL11.glPopMatrix();
/* 248 */       GL11.glMatrixMode(5889);
/* 249 */       GL11.glPopMatrix();
/* 250 */       GL11.glMatrixMode(5888);
/*     */       
/* 252 */       this.c.a(localFrameBuffer);
/* 253 */       this.h.e();
/*     */       
/* 255 */       this.c.b(localFrameBuffer);
/* 256 */       this.k = l1;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean l()
/*     */   {
/* 262 */     return this.c.q();
/*     */   }
/*     */   
/*     */   public boolean m()
/*     */   {
/* 267 */     return this.c.n();
/*     */   }
/*     */   
/*     */   public boolean n()
/*     */   {
/* 272 */     return this.c.m();
/*     */   }
/*     */   
/*     */   public void a(btz parambtz, long paramLong)
/*     */   {
/* 277 */     if ((!n()) || (!this.i)) return;
/* 278 */     long l1 = this.c.x();
/*     */     
/* 280 */     if (!this.c.a(parambtz.c(), l1 + paramLong, parambtz.a(), parambtz.b())) {
/* 281 */       b.warn(a, "Couldn't send stream metadata action at {}: {}", new Object[] { Long.valueOf(l1 + paramLong), parambtz });
/*     */     } else {
/* 283 */       b.debug(a, "Sent stream metadata action at {}: {}", new Object[] { Long.valueOf(l1 + paramLong), parambtz });
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean o()
/*     */   {
/* 308 */     return this.c.p();
/*     */   }
/*     */   
/*     */   public void p()
/*     */   {
/* 313 */     if (this.c.D()) {
/* 314 */       b.debug(a, "Requested commercial from Twitch");
/*     */     } else {
/* 316 */       b.warn(a, "Could not request commercial from Twitch");
/*     */     }
/*     */   }
/*     */   
/*     */   public void q()
/*     */   {
/* 322 */     this.c.F();
/* 323 */     this.n = true;
/*     */     
/* 325 */     s();
/*     */   }
/*     */   
/*     */   public void r()
/*     */   {
/* 330 */     this.c.G();
/* 331 */     this.n = false;
/*     */     
/* 333 */     s();
/*     */   }
/*     */   
/*     */   public void s()
/*     */   {
/* 338 */     if (n()) {
/* 339 */       float f1 = this.e.u.L;
/* 340 */       int i1 = (this.n) || (f1 <= 0.0F) ? 1 : 0;
/* 341 */       this.c.b(i1 != 0 ? 0.0F : f1);
/*     */       
/* 343 */       this.c.a(G() ? 0.0F : this.e.u.K);
/*     */     }
/*     */   }
/*     */   
/*     */   public void t()
/*     */   {
/* 349 */     bbj localbbj = this.e.u;
/* 350 */     VideoParams localVideoParams = this.c.a(b(localbbj.M), a(localbbj.N), c(localbbj.J), this.e.d / this.e.e);
/*     */     
/* 352 */     switch (localbbj.O) {
/*     */     case 2: 
/* 354 */       localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
/* 355 */       break;
/*     */     case 1: 
/* 357 */       localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
/* 358 */       break;
/*     */     case 0: 
/* 360 */       localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
/*     */     }
/*     */     
/*     */     
/* 364 */     if (this.h == null) {
/* 365 */       this.h = new bmg(localVideoParams.outputWidth, localVideoParams.outputHeight, false);
/*     */     } else {
/* 367 */       this.h.a(localVideoParams.outputWidth, localVideoParams.outputHeight);
/*     */     }
/*     */     
/* 370 */     if ((localbbj.Q != null) && (localbbj.Q.length() > 0)) {
/* 371 */       for (IngestServer localIngestServer : v()) {
/* 372 */         if (localIngestServer.serverUrl.equals(localbbj.Q)) {
/* 373 */           this.c.a(localIngestServer);
/* 374 */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 379 */     this.j = localVideoParams.targetFps;
/* 380 */     this.i = localbbj.P;
/* 381 */     this.c.a(localVideoParams);
/*     */     
/* 383 */     b.info(a, "Streaming at {}/{} at {} kbps to {}", new Object[] { Integer.valueOf(localVideoParams.outputWidth), Integer.valueOf(localVideoParams.outputHeight), Integer.valueOf(localVideoParams.maxKbps), this.c.s().serverUrl });
/* 384 */     this.c.a(null, "Minecraft", null);
/*     */   }
/*     */   
/*     */   public void u()
/*     */   {
/* 389 */     if (this.c.E()) {
/* 390 */       b.info(a, "Stopped streaming to Twitch");
/*     */     } else {
/* 392 */       b.warn(a, "Could not stop streaming to Twitch");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(ErrorCode paramErrorCode)
/*     */   {
/* 403 */     if (ErrorCode.succeeded(paramErrorCode)) {
/* 404 */       b.debug(a, "Login attempt successful");
/* 405 */       this.m = true;
/*     */     } else {
/* 407 */       b.warn(a, "Login attempt unsuccessful: {} (error code {})", new Object[] { ErrorCode.getString(paramErrorCode), Integer.valueOf(paramErrorCode.getValue()) });
/* 408 */       this.m = false;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(buc parambuc)
/*     */   {
/* 418 */     b.debug(a, "Broadcast state changed to {}", new Object[] { parambuc });
/*     */     
/* 420 */     if (parambuc == buc.b) {
/* 421 */       this.c.a(buc.d);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/* 427 */     b.info(a, "Logged out of twitch");
/*     */   }
/*     */   
/*     */   public void a(StreamInfo paramStreamInfo)
/*     */   {
/* 432 */     b.debug(a, "Stream info updated; {} viewers on stream ID {}", new Object[] { Integer.valueOf(paramStreamInfo.viewers), Long.valueOf(paramStreamInfo.streamId) });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b(ErrorCode paramErrorCode)
/*     */   {
/* 441 */     b.warn(a, "Issue submitting frame: {} (Error code {})", new Object[] { ErrorCode.getString(paramErrorCode), Integer.valueOf(paramErrorCode.getValue()) });
/* 442 */     this.e.r.b().a(new fq("Issue streaming frame: " + paramErrorCode + " (" + ErrorCode.getString(paramErrorCode) + ")"), 2);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/* 447 */     s();
/* 448 */     b.info(a, "Broadcast to Twitch has started");
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/* 453 */     b.info(a, "Broadcast to Twitch has stopped");
/*     */   }
/*     */   
/*     */   public void c(ErrorCode paramErrorCode) {
/*     */     fr localfr1;
/* 458 */     if (paramErrorCode == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED) {
/* 459 */       localfr1 = new fr("stream.unavailable.soundflower.chat.link", new Object[0]);
/* 460 */       localfr1.b().a(new fh(fi.a, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers"));
/* 461 */       localfr1.b().d(Boolean.valueOf(true));
/* 462 */       fr localfr2 = new fr("stream.unavailable.soundflower.chat", new Object[] { localfr1 });
/* 463 */       localfr2.b().a(a.e);
/* 464 */       this.e.r.b().a(localfr2);
/*     */     } else {
/* 466 */       localfr1 = new fr("stream.unavailable.unknown.chat", new Object[] { ErrorCode.getString(paramErrorCode) });
/* 467 */       localfr1.b().a(a.e);
/* 468 */       this.e.r.b().a(localfr1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bui parambui, bul parambul)
/*     */   {
/* 474 */     b.debug(a, "Ingest test state changed to {}", new Object[] { parambul });
/* 475 */     if (parambul == bul.f) {
/* 476 */       this.l = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(float paramFloat) {
/* 481 */     return qh.d(10.0F + paramFloat * 50.0F);
/*     */   }
/*     */   
/*     */   public static int b(float paramFloat) {
/* 485 */     return qh.d(230.0F + paramFloat * 3270.0F);
/*     */   }
/*     */   
/*     */   public static float c(float paramFloat) {
/* 489 */     return 0.1F + paramFloat * 0.1F;
/*     */   }
/*     */   
/*     */   public IngestServer[] v()
/*     */   {
/* 494 */     return this.c.t().getServers();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void x()
/*     */   {
/* 504 */     bui localbui = this.c.J();
/* 505 */     if (localbui != null) {
/* 506 */       localbui.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public bui y()
/*     */   {
/* 512 */     return this.c.w();
/*     */   }
/*     */   
/*     */   public boolean z()
/*     */   {
/* 517 */     return this.c.o();
/*     */   }
/*     */   
/*     */   public int A()
/*     */   {
/* 522 */     return n() ? this.c.j().viewers : 0;
/*     */   }
/*     */   
/*     */   public void a(ChatMessage[] paramArrayOfChatMessage)
/*     */   {
/* 527 */     for (ChatMessage localChatMessage : paramArrayOfChatMessage) {
/* 528 */       a(localChatMessage.userName, localChatMessage);
/*     */       
/* 530 */       if (a(localChatMessage.modes, localChatMessage.subscriptions, this.e.u.S)) {
/* 531 */         fq localfq1 = new fq(localChatMessage.userName);
/* 532 */         fr localfr = new fr("chat.stream." + (localChatMessage.action ? "emote" : "text"), new Object[] { this.f, localfq1, a.a(localChatMessage.message) });
/*     */         
/* 534 */         if (localChatMessage.action) {
/* 535 */           localfr.b().b(Boolean.valueOf(true));
/*     */         }
/*     */         
/* 538 */         fq localfq2 = new fq("");
/* 539 */         localfq2.a(new fr("stream.userinfo.chatTooltip", new Object[0]));
/*     */         
/* 541 */         for (fj localfj : bgs.a(localChatMessage.modes, localChatMessage.subscriptions, null)) {
/* 542 */           localfq2.a("\n");
/* 543 */           localfq2.a(localfj);
/*     */         }
/*     */         
/* 546 */         localfq1.b().a(new fl(fm.a, localfq2));
/* 547 */         localfq1.b().a(new fh(fi.d, localChatMessage.userName));
/*     */         
/* 549 */         this.e.r.b().a(localfr);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(String paramString, ChatMessage paramChatMessage) {
/* 555 */     ChatUserInfo localChatUserInfo = (ChatUserInfo)this.g.get(paramString);
/*     */     
/* 557 */     if (localChatUserInfo == null) {
/* 558 */       localChatUserInfo = new ChatUserInfo();
/* 559 */       localChatUserInfo.displayName = paramString;
/* 560 */       this.g.put(paramString, localChatUserInfo);
/*     */     }
/*     */     
/* 563 */     localChatUserInfo.subscriptions = paramChatMessage.subscriptions;
/* 564 */     localChatUserInfo.modes = paramChatMessage.modes;
/* 565 */     localChatUserInfo.emoticonSet = paramChatMessage.emoticonSet;
/* 566 */     localChatUserInfo.nameColorARGB = paramChatMessage.nameColorARGB;
/*     */   }
/*     */   
/*     */   private boolean a(HashSet paramHashSet1, HashSet paramHashSet2, int paramInt) {
/* 570 */     if (paramHashSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED)) return false;
/* 571 */     if (paramHashSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR)) return true;
/* 572 */     if (paramHashSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR)) return true;
/* 573 */     if (paramHashSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF)) { return true;
/*     */     }
/* 575 */     if (paramInt == 0)
/* 576 */       return true;
/* 577 */     if (paramInt == 1) {
/* 578 */       return paramHashSet2.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER);
/*     */     }
/*     */     
/* 581 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ChatUserInfo[] paramArrayOfChatUserInfo1, ChatUserInfo[] paramArrayOfChatUserInfo2, ChatUserInfo[] paramArrayOfChatUserInfo3) {
/*     */     ChatUserInfo localChatUserInfo;
/* 586 */     for (localChatUserInfo : paramArrayOfChatUserInfo2) {
/* 587 */       this.g.remove(localChatUserInfo.displayName);
/*     */     }
/*     */     
/* 590 */     for (localChatUserInfo : paramArrayOfChatUserInfo3) {
/* 591 */       this.g.put(localChatUserInfo.displayName, localChatUserInfo);
/*     */     }
/*     */     
/* 594 */     for (localChatUserInfo : paramArrayOfChatUserInfo1) {
/* 595 */       this.g.put(localChatUserInfo.displayName, localChatUserInfo);
/*     */     }
/*     */   }
/*     */   
/*     */   public void d()
/*     */   {
/* 601 */     b.debug(a, "Chat connected");
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 606 */     b.debug(a, "Chat disconnected");
/* 607 */     this.g.clear();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean B()
/*     */   {
/* 624 */     return (this.d.c()) && (this.d.c.equals(this.c.l().name));
/*     */   }
/*     */   
/*     */   public String C()
/*     */   {
/* 629 */     return this.d.c;
/*     */   }
/*     */   
/*     */   public ChatUserInfo a(String paramString)
/*     */   {
/* 634 */     return (ChatUserInfo)this.g.get(paramString);
/*     */   }
/*     */   
/*     */   public void b(String paramString)
/*     */   {
/* 639 */     this.d.g(paramString);
/*     */   }
/*     */   
/*     */   public boolean D()
/*     */   {
/* 644 */     return (q) && (this.c.b());
/*     */   }
/*     */   
/*     */   public ErrorCode E()
/*     */   {
/* 649 */     if (!q) {
/* 650 */       return ErrorCode.TTV_EC_OS_TOO_OLD;
/*     */     }
/*     */     
/* 653 */     return this.c.P();
/*     */   }
/*     */   
/*     */   public boolean F()
/*     */   {
/* 658 */     return this.m;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean)
/*     */   {
/* 663 */     this.o = paramBoolean;
/* 664 */     s();
/*     */   }
/*     */   
/*     */   public boolean G()
/*     */   {
/* 669 */     int i1 = this.e.u.T == 1 ? 1 : 0;
/*     */     
/* 671 */     return (this.n) || (this.e.u.K <= 0.0F) || (i1 != this.o);
/*     */   }
/*     */   
/*     */ 
/*     */   public bun H()
/*     */   {
/* 677 */     return this.p;
/*     */   }
/*     */   
/*     */   public void a(ErrorCode paramErrorCode, AuthToken paramAuthToken) {}
/*     */   
/*     */   public void a(ErrorCode paramErrorCode, GameInfo[] paramArrayOfGameInfo) {}
/*     */   
/*     */   public void a(IngestList paramIngestList) {}
/*     */   
/*     */   public void f() {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\buo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */