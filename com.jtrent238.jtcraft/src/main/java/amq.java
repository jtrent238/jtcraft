/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class amq
/*     */ {
/*     */   private final ahb a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/* 210 */   private int e = 0;
/*     */   private r f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   public amq(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 216 */     this.a = paramahb;
/* 217 */     this.b = paramInt4;
/* 218 */     this.d = amp.a[paramInt4][0];
/* 219 */     this.c = amp.a[paramInt4][1];
/*     */     
/* 221 */     int i = paramInt2;
/*     */     
/* 223 */     while ((paramInt2 > i - 21) && (paramInt2 > 0) && (a(paramahb.a(paramInt1, paramInt2 - 1, paramInt3)))) {
/* 224 */       paramInt2--;
/*     */     }
/*     */     
/* 227 */     int j = a(paramInt1, paramInt2, paramInt3, this.d) - 1;
/*     */     
/* 229 */     if (j >= 0) {
/* 230 */       this.f = new r(paramInt1 + j * p.a[this.d], paramInt2, paramInt3 + j * p.b[this.d]);
/* 231 */       this.h = a(this.f.a, this.f.b, this.f.c, this.c);
/*     */       
/* 233 */       if ((this.h < 2) || (this.h > 21)) {
/* 234 */         this.f = null;
/* 235 */         this.h = 0;
/*     */       }
/*     */     }
/*     */     
/* 239 */     if (this.f != null) {
/* 240 */       this.g = a();
/*     */     }
/*     */   }
/*     */   
/*     */   protected int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 246 */     int j = p.a[paramInt4];
/* 247 */     int k = p.b[paramInt4];
/*     */     
/* 249 */     for (int i = 0; i < 22; i++) {
/* 250 */       localaji1 = this.a.a(paramInt1 + j * i, paramInt2, paramInt3 + k * i);
/* 251 */       if (!a(localaji1)) {
/*     */         break;
/*     */       }
/*     */       
/* 255 */       aji localaji2 = this.a.a(paramInt1 + j * i, paramInt2 - 1, paramInt3 + k * i);
/* 256 */       if (localaji2 != ajn.Z) {
/*     */         break;
/*     */       }
/*     */     }
/*     */     
/* 261 */     aji localaji1 = this.a.a(paramInt1 + j * i, paramInt2, paramInt3 + k * i);
/* 262 */     if (localaji1 == ajn.Z) {
/* 263 */       return i;
/*     */     }
/* 265 */     return 0; }
/*     */   
/*     */   protected int a() { int j;
/*     */     int k;
/*     */     int m;
/* 270 */     for (this.g = 0; this.g < 21; this.g += 1) {
/* 271 */       i = this.f.b + this.g;
/*     */       
/* 273 */       for (j = 0; j < this.h; j++) {
/* 274 */         k = this.f.a + j * p.a[amp.a[this.b][1]];
/* 275 */         m = this.f.c + j * p.b[amp.a[this.b][1]];
/*     */         
/* 277 */         aji localaji = this.a.a(k, i, m);
/* 278 */         if (!a(localaji)) {
/*     */           break label272;
/*     */         }
/*     */         
/* 282 */         if (localaji == ajn.aO) { this.e += 1;
/*     */         }
/* 284 */         if (j == 0) {
/* 285 */           localaji = this.a.a(k + p.a[amp.a[this.b][0]], i, m + p.b[amp.a[this.b][0]]);
/* 286 */           if (localaji != ajn.Z) {
/*     */             break label272;
/*     */           }
/* 289 */         } else if (j == this.h - 1) {
/* 290 */           localaji = this.a.a(k + p.a[amp.a[this.b][1]], i, m + p.b[amp.a[this.b][1]]);
/* 291 */           if (localaji != ajn.Z) {
/*     */             break label272;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     label272:
/* 298 */     for (int i = 0; i < this.h; i++) {
/* 299 */       j = this.f.a + i * p.a[amp.a[this.b][1]];
/* 300 */       k = this.f.b + this.g;
/* 301 */       m = this.f.c + i * p.b[amp.a[this.b][1]];
/*     */       
/* 303 */       if (this.a.a(j, k, m) != ajn.Z) {
/* 304 */         this.g = 0;
/* 305 */         break;
/*     */       }
/*     */     }
/*     */     
/* 309 */     if ((this.g > 21) || (this.g < 3)) {
/* 310 */       this.f = null;
/* 311 */       this.h = 0;
/* 312 */       this.g = 0;
/* 313 */       return 0;
/*     */     }
/* 315 */     return this.g;
/*     */   }
/*     */   
/*     */   protected boolean a(aji paramaji)
/*     */   {
/* 320 */     return (paramaji.J == awt.a) || (paramaji == ajn.ab) || (paramaji == ajn.aO);
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 324 */     return (this.f != null) && (this.h >= 2) && (this.h <= 21) && (this.g >= 3) && (this.g <= 21);
/*     */   }
/*     */   
/*     */   public void c() {
/* 328 */     for (int i = 0; i < this.h; i++) {
/* 329 */       int j = this.f.a + p.a[this.c] * i;
/* 330 */       int k = this.f.c + p.b[this.c] * i;
/*     */       
/* 332 */       for (int m = 0; m < this.g; m++) {
/* 333 */         int n = this.f.b + m;
/* 334 */         this.a.d(j, n, k, ajn.aO, this.b, 2);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */