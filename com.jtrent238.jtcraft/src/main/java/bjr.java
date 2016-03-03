/*     */ import com.mojang.authlib.GameProfile;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ class bjr
/*     */   implements jy
/*     */ {
/*     */   bjr(bjq parambjq, bjn parambjn, ej paramej) {}
/*     */   
/*  50 */   private boolean d = false;
/*     */   
/*     */   public void a(ka paramka) {
/*  53 */     kb localkb = paramka.c();
/*     */     
/*  55 */     if (localkb.a() != null) {
/*  56 */       this.a.d = localkb.a().d();
/*     */     } else {
/*  58 */       this.a.d = "";
/*     */     }
/*     */     
/*  61 */     if (localkb.c() != null) {
/*  62 */       this.a.g = localkb.c().a();
/*  63 */       this.a.f = localkb.c().b();
/*     */     } else {
/*  65 */       this.a.g = "Old";
/*  66 */       this.a.f = 0;
/*     */     }
/*     */     Object localObject;
/*  69 */     if (localkb.b() != null) {
/*  70 */       this.a.c = (a.h + "" + localkb.b().b() + "" + a.i + "/" + a.h + localkb.b().a());
/*     */       
/*  72 */       if (ArrayUtils.isNotEmpty(localkb.b().c())) {
/*  73 */         localObject = new StringBuilder();
/*  74 */         for (GameProfile localGameProfile : localkb.b().c()) {
/*  75 */           if (((StringBuilder)localObject).length() > 0) ((StringBuilder)localObject).append("\n");
/*  76 */           ((StringBuilder)localObject).append(localGameProfile.getName());
/*     */         }
/*  78 */         if (localkb.b().c().length < localkb.b().b()) {
/*  79 */           if (((StringBuilder)localObject).length() > 0) ((StringBuilder)localObject).append("\n");
/*  80 */           ((StringBuilder)localObject).append("... and ").append(localkb.b().b() - localkb.b().c().length).append(" more ...");
/*     */         }
/*  82 */         this.a.i = ((StringBuilder)localObject).toString();
/*     */       }
/*     */     } else {
/*  85 */       this.a.c = (a.i + "???");
/*     */     }
/*     */     
/*  88 */     if (localkb.d() != null) {
/*  89 */       localObject = localkb.d();
/*  90 */       if (((String)localObject).startsWith("data:image/png;base64,")) {
/*  91 */         this.a.a(((String)localObject).substring("data:image/png;base64,".length()));
/*     */       } else {
/*  93 */         bjq.c().error("Invalid server icon (unknown format)");
/*     */       }
/*     */     } else {
/*  96 */       this.a.a(null);
/*     */     }
/*     */     
/*  99 */     this.b.a(new ki(bao.K()), new GenericFutureListener[0]);
/* 100 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void a(jz paramjz)
/*     */   {
/* 105 */     long l1 = paramjz.c();
/* 106 */     long l2 = bao.K();
/* 107 */     this.a.e = (l2 - l1);
/*     */     
/* 109 */     this.b.a(new fq("Finished"));
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/* 114 */     if (!this.d) {
/* 115 */       bjq.c().error("Can't ping " + this.a.b + ": " + paramfj.c());
/* 116 */       this.a.d = (a.e + "Can't connect to server.");
/* 117 */       this.a.c = "";
/*     */       
/* 119 */       bjq.a(this.c, this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(eo parameo1, eo parameo2)
/*     */   {
/* 125 */     if (parameo2 != eo.c) {
/* 126 */       throw new UnsupportedOperationException("Unexpected change in protocol to " + parameo2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */