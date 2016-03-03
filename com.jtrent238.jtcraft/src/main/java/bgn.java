/*     */ import tv.twitch.broadcast.IngestServer;
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
/*     */ class bgn
/*     */   extends bcm
/*     */ {
/*     */   public bgn(bgm parambgm)
/*     */   {
/*  64 */     super(bgm.a(parambgm), parambgm.l, parambgm.m, 32, parambgm.m - 35, (int)(bgm.b(parambgm).l.a * 3.5D));
/*  65 */     a(false);
/*     */   }
/*     */   
/*     */   protected int b()
/*     */   {
/*  70 */     return bgm.c(this.k).Z().v().length;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*     */   {
/*  75 */     bgm.d(this.k).u.Q = bgm.e(this.k).Z().v()[paramInt1].serverUrl;
/*  76 */     bgm.f(this.k).u.b();
/*     */   }
/*     */   
/*     */   protected boolean a(int paramInt)
/*     */   {
/*  81 */     return bgm.h(this.k).Z().v()[paramInt].serverUrl.equals(bgm.g(this.k).u.Q);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void a() {}
/*     */   
/*     */ 
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bmh parambmh, int paramInt5, int paramInt6)
/*     */   {
/*  91 */     IngestServer localIngestServer = bgm.i(this.k).Z().v()[paramInt1];
/*  92 */     String str1 = localIngestServer.serverUrl.replaceAll("\\{stream_key\\}", "");
/*  93 */     String str2 = (int)localIngestServer.bitrateKbps + " kbps";
/*  94 */     String str3 = null;
/*  95 */     bui localbui = bgm.j(this.k).Z().y();
/*     */     
/*  97 */     if (localbui != null) {
/*  98 */       if (localIngestServer == localbui.c()) {
/*  99 */         str1 = a.k + str1;
/* 100 */         str2 = (int)(localbui.h() * 100.0F) + "%";
/* 101 */       } else if (paramInt1 < localbui.p()) {
/* 102 */         if (localIngestServer.bitrateKbps == 0.0F) {
/* 103 */           str2 = a.m + "Down!";
/*     */         }
/*     */       } else {
/* 106 */         str2 = a.q + "1234" + a.v + " kbps";
/*     */       }
/* 108 */     } else if (localIngestServer.bitrateKbps == 0.0F) {
/* 109 */       str2 = a.m + "Down!";
/*     */     }
/*     */     
/* 112 */     paramInt2 -= 15;
/*     */     
/* 114 */     if (a(paramInt1)) {
/* 115 */       str3 = a.j + "(Preferred)";
/* 116 */     } else if (localIngestServer.defaultServer) {
/* 117 */       str3 = a.k + "(Default)";
/*     */     }
/*     */     
/* 120 */     this.k.b(bgm.k(this.k), localIngestServer.serverName, paramInt2 + 2, paramInt3 + 5, 16777215);
/* 121 */     this.k.b(bgm.l(this.k), str1, paramInt2 + 2, paramInt3 + bgm.m(this.k).a + 5 + 3, 3158064);
/* 122 */     this.k.b(bgm.n(this.k), str2, d() - 5 - bgm.o(this.k).a(str2), paramInt3 + 5, 8421504);
/* 123 */     if (str3 != null) this.k.b(bgm.p(this.k), str3, d() - 5 - bgm.q(this.k).a(str3), paramInt3 + 5 + 3 + bgm.r(this.k).a, 8421504);
/*     */   }
/*     */   
/*     */   protected int d()
/*     */   {
/* 128 */     return super.d() + 15;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */