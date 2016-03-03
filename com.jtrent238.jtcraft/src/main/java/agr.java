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
/*     */ public class agr
/*     */   extends qw
/*     */ {
/*     */   public final dh b;
/*     */   public final String c;
/*     */   
/*     */   public agr(agq paramagq, dh paramdh)
/*     */   {
/* 274 */     super(paramdh.f("Weight"));
/*     */     
/* 276 */     dh localdh = paramdh.m("Properties");
/* 277 */     String str = paramdh.j("Type");
/*     */     
/* 279 */     if (str.equals("Minecart")) {
/* 280 */       if (localdh != null) {
/* 281 */         switch (localdh.f("Type")) {
/*     */         case 1: 
/* 283 */           str = "MinecartChest";
/* 284 */           break;
/*     */         case 2: 
/* 286 */           str = "MinecartFurnace";
/* 287 */           break;
/*     */         case 0: 
/* 289 */           str = "MinecartRideable";
/*     */         }
/*     */         
/*     */       } else {
/* 293 */         str = "MinecartRideable";
/*     */       }
/*     */     }
/*     */     
/* 297 */     this.b = localdh;
/* 298 */     this.c = str;
/*     */   }
/*     */   
/*     */   public agr(agq paramagq, dh paramdh, String paramString) {
/* 302 */     super(1);
/*     */     
/* 304 */     if (paramString.equals("Minecart")) {
/* 305 */       if (paramdh != null) {
/* 306 */         switch (paramdh.f("Type")) {
/*     */         case 1: 
/* 308 */           paramString = "MinecartChest";
/* 309 */           break;
/*     */         case 2: 
/* 311 */           paramString = "MinecartFurnace";
/* 312 */           break;
/*     */         case 0: 
/* 314 */           paramString = "MinecartRideable";
/*     */         }
/*     */         
/*     */       } else {
/* 318 */         paramString = "MinecartRideable";
/*     */       }
/*     */     }
/*     */     
/* 322 */     this.b = paramdh;
/* 323 */     this.c = paramString;
/*     */   }
/*     */   
/*     */   public dh a() {
/* 327 */     dh localdh = new dh();
/*     */     
/* 329 */     localdh.a("Properties", this.b);
/* 330 */     localdh.a("Type", this.c);
/* 331 */     localdh.a("Weight", this.a);
/*     */     
/* 333 */     return localdh;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */