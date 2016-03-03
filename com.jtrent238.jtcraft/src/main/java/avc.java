/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class avc
/*     */   extends avk
/*     */ {
/* 213 */   protected avd d = avd.a;
/*     */   
/*     */ 
/*     */   public avc() {}
/*     */   
/*     */   protected avc(int paramInt)
/*     */   {
/* 220 */     super(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void a(dh paramdh)
/*     */   {
/* 229 */     paramdh.a("EntryDoor", this.d.name());
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 234 */     this.d = avd.valueOf(paramdh.j("EntryDoor"));
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, Random paramRandom, asv paramasv, avd paramavd, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 239 */     switch (aul.a[paramavd.ordinal()]) {
/*     */     case 1: 
/*     */     default: 
/* 242 */       a(paramahb, paramasv, paramInt1, paramInt2, paramInt3, paramInt1 + 3 - 1, paramInt2 + 3 - 1, paramInt3, ajn.a, ajn.a, false);
/* 243 */       break;
/*     */     case 2: 
/* 245 */       a(paramahb, ajn.aV, 0, paramInt1, paramInt2, paramInt3, paramasv);
/* 246 */       a(paramahb, ajn.aV, 0, paramInt1, paramInt2 + 1, paramInt3, paramasv);
/* 247 */       a(paramahb, ajn.aV, 0, paramInt1, paramInt2 + 2, paramInt3, paramasv);
/* 248 */       a(paramahb, ajn.aV, 0, paramInt1 + 1, paramInt2 + 2, paramInt3, paramasv);
/* 249 */       a(paramahb, ajn.aV, 0, paramInt1 + 2, paramInt2 + 2, paramInt3, paramasv);
/* 250 */       a(paramahb, ajn.aV, 0, paramInt1 + 2, paramInt2 + 1, paramInt3, paramasv);
/* 251 */       a(paramahb, ajn.aV, 0, paramInt1 + 2, paramInt2, paramInt3, paramasv);
/* 252 */       a(paramahb, ajn.ao, 0, paramInt1 + 1, paramInt2, paramInt3, paramasv);
/* 253 */       a(paramahb, ajn.ao, 8, paramInt1 + 1, paramInt2 + 1, paramInt3, paramasv);
/* 254 */       break;
/*     */     case 3: 
/* 256 */       a(paramahb, ajn.a, 0, paramInt1 + 1, paramInt2, paramInt3, paramasv);
/* 257 */       a(paramahb, ajn.a, 0, paramInt1 + 1, paramInt2 + 1, paramInt3, paramasv);
/* 258 */       a(paramahb, ajn.aY, 0, paramInt1, paramInt2, paramInt3, paramasv);
/* 259 */       a(paramahb, ajn.aY, 0, paramInt1, paramInt2 + 1, paramInt3, paramasv);
/* 260 */       a(paramahb, ajn.aY, 0, paramInt1, paramInt2 + 2, paramInt3, paramasv);
/* 261 */       a(paramahb, ajn.aY, 0, paramInt1 + 1, paramInt2 + 2, paramInt3, paramasv);
/* 262 */       a(paramahb, ajn.aY, 0, paramInt1 + 2, paramInt2 + 2, paramInt3, paramasv);
/* 263 */       a(paramahb, ajn.aY, 0, paramInt1 + 2, paramInt2 + 1, paramInt3, paramasv);
/* 264 */       a(paramahb, ajn.aY, 0, paramInt1 + 2, paramInt2, paramInt3, paramasv);
/* 265 */       break;
/*     */     case 4: 
/* 267 */       a(paramahb, ajn.aV, 0, paramInt1, paramInt2, paramInt3, paramasv);
/* 268 */       a(paramahb, ajn.aV, 0, paramInt1, paramInt2 + 1, paramInt3, paramasv);
/* 269 */       a(paramahb, ajn.aV, 0, paramInt1, paramInt2 + 2, paramInt3, paramasv);
/* 270 */       a(paramahb, ajn.aV, 0, paramInt1 + 1, paramInt2 + 2, paramInt3, paramasv);
/* 271 */       a(paramahb, ajn.aV, 0, paramInt1 + 2, paramInt2 + 2, paramInt3, paramasv);
/* 272 */       a(paramahb, ajn.aV, 0, paramInt1 + 2, paramInt2 + 1, paramInt3, paramasv);
/* 273 */       a(paramahb, ajn.aV, 0, paramInt1 + 2, paramInt2, paramInt3, paramasv);
/* 274 */       a(paramahb, ajn.av, 0, paramInt1 + 1, paramInt2, paramInt3, paramasv);
/* 275 */       a(paramahb, ajn.av, 8, paramInt1 + 1, paramInt2 + 1, paramInt3, paramasv);
/* 276 */       a(paramahb, ajn.aB, a(ajn.aB, 4), paramInt1 + 2, paramInt2 + 1, paramInt3 + 1, paramasv);
/* 277 */       a(paramahb, ajn.aB, a(ajn.aB, 3), paramInt1 + 2, paramInt2 + 1, paramInt3 - 1, paramasv);
/*     */     }
/*     */   }
/*     */   
/*     */   protected avd a(Random paramRandom)
/*     */   {
/* 283 */     int i = paramRandom.nextInt(5);
/* 284 */     switch (i) {
/*     */     case 0: 
/*     */     case 1: 
/*     */     default: 
/* 288 */       return avd.a;
/*     */     case 2: 
/* 290 */       return avd.b;
/*     */     case 3: 
/* 292 */       return avd.c;
/*     */     }
/* 294 */     return avd.d;
/*     */   }
/*     */   
/*     */   protected avk a(auz paramauz, List paramList, Random paramRandom, int paramInt1, int paramInt2)
/*     */   {
/* 299 */     switch (this.g) {
/*     */     case 2: 
/* 301 */       return aui.a(paramauz, paramList, paramRandom, this.f.a + paramInt1, this.f.b + paramInt2, this.f.c - 1, this.g, d());
/*     */     case 0: 
/* 303 */       return aui.a(paramauz, paramList, paramRandom, this.f.a + paramInt1, this.f.b + paramInt2, this.f.f + 1, this.g, d());
/*     */     case 1: 
/* 305 */       return aui.a(paramauz, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt2, this.f.c + paramInt1, this.g, d());
/*     */     case 3: 
/* 307 */       return aui.a(paramauz, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt2, this.f.c + paramInt1, this.g, d());
/*     */     }
/* 309 */     return null;
/*     */   }
/*     */   
/*     */   protected avk b(auz paramauz, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
/* 313 */     switch (this.g) {
/*     */     case 2: 
/* 315 */       return aui.a(paramauz, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt1, this.f.c + paramInt2, 1, d());
/*     */     case 0: 
/* 317 */       return aui.a(paramauz, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt1, this.f.c + paramInt2, 1, d());
/*     */     case 1: 
/* 319 */       return aui.a(paramauz, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.c - 1, 2, d());
/*     */     case 3: 
/* 321 */       return aui.a(paramauz, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.c - 1, 2, d());
/*     */     }
/* 323 */     return null;
/*     */   }
/*     */   
/*     */   protected avk c(auz paramauz, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
/* 327 */     switch (this.g) {
/*     */     case 2: 
/* 329 */       return aui.a(paramauz, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt1, this.f.c + paramInt2, 3, d());
/*     */     case 0: 
/* 331 */       return aui.a(paramauz, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt1, this.f.c + paramInt2, 3, d());
/*     */     case 1: 
/* 333 */       return aui.a(paramauz, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.f + 1, 0, d());
/*     */     case 3: 
/* 335 */       return aui.a(paramauz, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.f + 1, 0, d());
/*     */     }
/* 337 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(asv paramasv) {
/* 341 */     return (paramasv != null) && (paramasv.b > 10);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\avc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */