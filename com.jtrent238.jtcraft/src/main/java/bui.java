/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import tv.twitch.AuthToken;
/*     */ import tv.twitch.ErrorCode;
/*     */ import tv.twitch.broadcast.ArchivingState;
/*     */ import tv.twitch.broadcast.AudioParams;
/*     */ import tv.twitch.broadcast.ChannelInfo;
/*     */ import tv.twitch.broadcast.EncodingCpuUsage;
/*     */ import tv.twitch.broadcast.FrameBuffer;
/*     */ import tv.twitch.broadcast.GameInfoList;
/*     */ import tv.twitch.broadcast.IStatCallbacks;
/*     */ import tv.twitch.broadcast.IStreamCallbacks;
/*     */ import tv.twitch.broadcast.IngestList;
/*     */ import tv.twitch.broadcast.IngestServer;
/*     */ import tv.twitch.broadcast.PixelFormat;
/*     */ import tv.twitch.broadcast.RTMPState;
/*     */ import tv.twitch.broadcast.StartFlags;
/*     */ import tv.twitch.broadcast.StatType;
/*     */ import tv.twitch.broadcast.Stream;
/*     */ import tv.twitch.broadcast.StreamInfo;
/*     */ import tv.twitch.broadcast.UserInfo;
/*     */ import tv.twitch.broadcast.VideoParams;
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
/*     */ public class bui
/*     */   implements IStatCallbacks, IStreamCallbacks
/*     */ {
/*  38 */   protected final boolean a = true;
/*     */   
/*  40 */   protected buk b = null;
/*     */   
/*  42 */   protected Stream c = null;
/*  43 */   protected IngestList d = null;
/*     */   
/*  45 */   protected bul e = bul.a;
/*  46 */   protected long f = 8000L;
/*  47 */   protected long g = 1000L;
/*  48 */   protected long h = 0L;
/*  49 */   protected RTMPState i = RTMPState.Invalid;
/*  50 */   protected VideoParams j = null;
/*  51 */   protected AudioParams k = null;
/*  52 */   protected long l = 0L;
/*  53 */   protected List m = null;
/*  54 */   protected boolean n = false;
/*  55 */   protected IStreamCallbacks o = null;
/*  56 */   protected IStatCallbacks p = null;
/*  57 */   protected IngestServer q = null;
/*  58 */   protected boolean r = false;
/*  59 */   protected boolean s = false;
/*  60 */   protected int t = -1;
/*  61 */   protected int u = 0;
/*  62 */   protected long v = 0L;
/*  63 */   protected float w = 0.0F;
/*  64 */   protected float x = 0.0F;
/*  65 */   protected boolean y = false;
/*     */   
/*     */   public void a(buk parambuk)
/*     */   {
/*  69 */     this.b = parambuk;
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
/*     */   public IngestServer c()
/*     */   {
/*  83 */     return this.q;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean e()
/*     */   {
/*  93 */     return (this.e == bul.f) || (this.e == bul.g) || (this.e == bul.h);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public float h()
/*     */   {
/* 120 */     return this.x;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void requestAuthTokenCallback(ErrorCode paramErrorCode, AuthToken paramAuthToken) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void loginCallback(ErrorCode paramErrorCode, ChannelInfo paramChannelInfo) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void getIngestServersCallback(ErrorCode paramErrorCode, IngestList paramIngestList) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void getUserInfoCallback(ErrorCode paramErrorCode, UserInfo paramUserInfo) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void getStreamInfoCallback(ErrorCode paramErrorCode, StreamInfo paramStreamInfo) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void getArchivingStateCallback(ErrorCode paramErrorCode, ArchivingState paramArchivingState) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void runCommercialCallback(ErrorCode paramErrorCode) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void setStreamInfoCallback(ErrorCode paramErrorCode) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void getGameNameListCallback(ErrorCode paramErrorCode, GameInfoList paramGameInfoList) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void bufferUnlockCallback(long paramLong) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void startCallback(ErrorCode paramErrorCode)
/*     */   {
/* 167 */     this.y = false;
/*     */     
/*     */ 
/* 170 */     if (ErrorCode.succeeded(paramErrorCode))
/*     */     {
/* 172 */       a(bul.c);
/*     */       
/* 174 */       this.l = System.currentTimeMillis();
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 179 */       this.n = false;
/* 180 */       a(bul.e);
/*     */     }
/*     */   }
/*     */   
/*     */   public void stopCallback(ErrorCode paramErrorCode)
/*     */   {
/* 186 */     this.y = false;
/*     */     
/* 188 */     a(bul.e);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void sendActionMetaDataCallback(ErrorCode paramErrorCode) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void sendStartSpanMetaDataCallback(ErrorCode paramErrorCode) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void sendEndSpanMetaDataCallback(ErrorCode paramErrorCode) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void statCallback(StatType paramStatType, long paramLong)
/*     */   {
/* 212 */     switch (buj.a[paramStatType.ordinal()])
/*     */     {
/*     */     case 1: 
/* 215 */       this.i = RTMPState.lookupValue((int)paramLong);
/* 216 */       break;
/*     */     
/*     */     case 2: 
/* 219 */       this.h = paramLong;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public bui(Stream paramStream, IngestList paramIngestList)
/*     */   {
/* 229 */     this.c = paramStream;
/* 230 */     this.d = paramIngestList;
/*     */   }
/*     */   
/*     */   protected void finalize()
/*     */   {
/* 235 */     if (this.q != null)
/*     */     {
/* 237 */       b(this.q);
/*     */     }
/*     */     
/* 240 */     o();
/*     */     
/* 242 */     super.finalize();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void i()
/*     */   {
/* 251 */     if (this.e != bul.a)
/*     */     {
/* 253 */       return;
/*     */     }
/*     */     
/* 256 */     this.t = 0;
/* 257 */     this.r = false;
/* 258 */     this.s = false;
/*     */     
/* 260 */     this.p = this.c.getStatCallbacks();
/* 261 */     this.c.setStatCallbacks(this);
/*     */     
/* 263 */     this.o = this.c.getStreamCallbacks();
/* 264 */     this.c.setStreamCallbacks(this);
/*     */     
/* 266 */     this.j = new VideoParams();
/* 267 */     this.j.targetFps = 60;
/* 268 */     this.j.maxKbps = 3500;
/* 269 */     this.j.outputWidth = 1280;
/* 270 */     this.j.outputHeight = 720;
/* 271 */     this.j.pixelFormat = PixelFormat.TTV_PF_BGRA;
/* 272 */     this.j.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
/* 273 */     this.j.disableAdaptiveBitrate = true;
/* 274 */     this.j.verticalFlip = false;
/*     */     
/* 276 */     this.c.getDefaultParams(this.j);
/*     */     
/* 278 */     this.k = new AudioParams();
/* 279 */     this.k.audioEnabled = false;
/*     */     
/* 281 */     this.m = new ArrayList();
/*     */     
/*     */ 
/* 284 */     int i1 = 3;
/*     */     
/* 286 */     for (int i2 = 0; i2 < i1; i2++)
/*     */     {
/* 288 */       FrameBuffer localFrameBuffer = this.c.allocateFrameBuffer(this.j.outputWidth * this.j.outputHeight * 4);
/* 289 */       if (!localFrameBuffer.getIsValid())
/*     */       {
/* 291 */         o();
/* 292 */         a(bul.h);
/* 293 */         return;
/*     */       }
/*     */       
/* 296 */       this.m.add(localFrameBuffer);
/*     */       
/* 298 */       this.c.randomizeFrameBuffer(localFrameBuffer);
/*     */     }
/*     */     
/* 301 */     a(bul.b);
/*     */     
/* 303 */     this.l = System.currentTimeMillis();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void j()
/*     */   {
/* 311 */     if ((e()) || (this.e == bul.a))
/*     */     {
/* 313 */       return;
/*     */     }
/*     */     
/* 316 */     if (this.y)
/*     */     {
/* 318 */       return;
/*     */     }
/*     */     
/* 321 */     if (this.r)
/*     */     {
/* 323 */       a(bul.g);
/*     */     }
/*     */     
/* 326 */     switch (buj.b[this.e.ordinal()])
/*     */     {
/*     */ 
/*     */ 
/*     */     case 1: 
/*     */     case 2: 
/* 332 */       if (this.q != null)
/*     */       {
/* 334 */         if ((this.s) || (!this.n))
/*     */         {
/* 336 */           this.q.bitrateKbps = 0.0F;
/* 337 */           this.l = 0L;
/* 338 */           this.y = false;
/*     */         }
/*     */         else
/*     */         {
/* 342 */           b(this.q);
/*     */         }
/* 344 */         this.q = null;
/*     */ 
/*     */       }
/* 347 */       else if ((!this.y) && (m() >= this.g))
/*     */       {
/*     */ 
/* 350 */         this.l = 0L;
/*     */         
/* 352 */         this.s = false;
/* 353 */         this.n = true;
/*     */         
/* 355 */         if (this.e != bul.b)
/*     */         {
/* 357 */           this.t += 1;
/*     */         }
/*     */         
/*     */ 
/* 361 */         if (this.t < this.d.getServers().length)
/*     */         {
/* 363 */           this.q = this.d.getServers()[this.t];
/* 364 */           a(this.q);
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 369 */           a(bul.f);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       break;
/*     */     case 3: 
/*     */     case 4: 
/* 377 */       c(this.q);
/* 378 */       break;
/*     */     }
/*     */     
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */     n();
/*     */     
/*     */ 
/* 389 */     if ((this.e == bul.g) || (this.e == bul.f))
/*     */     {
/* 391 */       if (this.q != null)
/*     */       {
/* 393 */         if (this.e == bul.g)
/*     */         {
/* 395 */           this.q.bitrateKbps = 0.0F;
/*     */         }
/*     */         
/* 398 */         b(this.q);
/* 399 */         this.q = null;
/*     */       }
/*     */       
/* 402 */       if (this.m != null)
/*     */       {
/* 404 */         o();
/*     */       }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void l()
/*     */   {
/* 435 */     if (e())
/*     */     {
/* 437 */       return;
/*     */     }
/*     */     
/* 440 */     this.r = true;
/*     */   }
/*     */   
/*     */ 
/*     */   protected boolean a(IngestServer paramIngestServer)
/*     */   {
/* 446 */     this.n = true;
/* 447 */     this.h = 0L;
/* 448 */     this.i = RTMPState.Idle;
/* 449 */     this.q = paramIngestServer;
/*     */     
/*     */ 
/* 452 */     a(bul.c);
/* 453 */     this.y = true;
/* 454 */     ErrorCode localErrorCode = this.c.start(this.j, this.k, paramIngestServer, StartFlags.TTV_Start_BandwidthTest, true);
/* 455 */     if (ErrorCode.failed(localErrorCode))
/*     */     {
/* 457 */       this.n = false;
/* 458 */       a(bul.e);
/* 459 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 463 */     this.v = this.h;
/*     */     
/* 465 */     paramIngestServer.bitrateKbps = 0.0F;
/* 466 */     this.u = 0;
/*     */     
/* 468 */     return true;
/*     */   }
/*     */   
/*     */   protected void b(IngestServer paramIngestServer)
/*     */   {
/* 473 */     this.y = true;
/* 474 */     this.c.stop(true);
/*     */     
/* 476 */     this.c.pollStats();
/*     */   }
/*     */   
/*     */   protected long m()
/*     */   {
/* 481 */     return System.currentTimeMillis() - this.l;
/*     */   }
/*     */   
/*     */   protected void n()
/*     */   {
/* 486 */     float f1 = (float)m();
/*     */     
/* 488 */     switch (buj.b[this.e.ordinal()])
/*     */     {
/*     */ 
/*     */     case 1: 
/*     */     case 3: 
/*     */     case 5: 
/*     */     case 6: 
/*     */     case 7: 
/*     */     case 8: 
/* 497 */       this.x = 0.0F;
/* 498 */       break;
/*     */     
/*     */ 
/*     */     case 2: 
/* 502 */       this.x = 1.0F;
/* 503 */       break;
/*     */     
/*     */     case 4: 
/*     */     default: 
/* 507 */       this.x = (f1 / (float)this.f);
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 512 */     switch (buj.b[this.e.ordinal()])
/*     */     {
/*     */ 
/*     */     case 6: 
/*     */     case 7: 
/*     */     case 8: 
/* 518 */       this.w = 1.0F;
/* 519 */       break;
/*     */     
/*     */ 
/*     */     default: 
/* 523 */       this.w = (this.t / this.d.getServers().length);
/* 524 */       this.w += this.x / this.d.getServers().length;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */   protected boolean c(IngestServer paramIngestServer)
/*     */   {
/* 532 */     if ((this.s) || (m() >= this.f))
/*     */     {
/* 534 */       a(bul.e);
/* 535 */       return true;
/*     */     }
/*     */     
/*     */ 
/* 539 */     if (this.y)
/*     */     {
/* 541 */       return true;
/*     */     }
/*     */     
/* 544 */     ErrorCode localErrorCode = this.c.submitVideoFrame((FrameBuffer)this.m.get(this.u));
/* 545 */     if (ErrorCode.failed(localErrorCode))
/*     */     {
/* 547 */       this.n = false;
/* 548 */       a(bul.e);
/* 549 */       return false;
/*     */     }
/*     */     
/* 552 */     this.u = ((this.u + 1) % this.m.size());
/*     */     
/* 554 */     this.c.pollStats();
/*     */     
/*     */ 
/* 557 */     if (this.i == RTMPState.SendVideo)
/*     */     {
/* 559 */       a(bul.d);
/*     */       
/* 561 */       long l1 = m();
/* 562 */       if ((l1 > 0L) && (this.h > this.v))
/*     */       {
/* 564 */         paramIngestServer.bitrateKbps = ((float)(this.h * 8L) / (float)m());
/* 565 */         this.v = this.h;
/*     */       }
/*     */     }
/*     */     
/* 569 */     return true;
/*     */   }
/*     */   
/*     */   protected void o()
/*     */   {
/* 574 */     this.q = null;
/*     */     
/*     */ 
/* 577 */     if (this.m != null)
/*     */     {
/* 579 */       for (int i1 = 0; i1 < this.m.size(); i1++)
/*     */       {
/* 581 */         ((FrameBuffer)this.m.get(i1)).free();
/*     */       }
/*     */       
/* 584 */       this.m = null;
/*     */     }
/*     */     
/* 587 */     if (this.c.getStatCallbacks() == this)
/*     */     {
/* 589 */       this.c.setStatCallbacks(this.p);
/* 590 */       this.p = null;
/*     */     }
/*     */     
/* 593 */     if (this.c.getStreamCallbacks() == this)
/*     */     {
/* 595 */       this.c.setStreamCallbacks(this.o);
/* 596 */       this.o = null;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(bul parambul)
/*     */   {
/* 602 */     if (parambul == this.e)
/*     */     {
/* 604 */       return;
/*     */     }
/*     */     
/* 607 */     this.e = parambul;
/*     */     
/* 609 */     if (this.b != null)
/*     */     {
/* 611 */       this.b.a(this, parambul);
/*     */     }
/*     */   }
/*     */   
/*     */   public int p() {
/* 616 */     return this.t;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */