/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bpx
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private List e;
/*     */   private bpw f;
/*     */   
/*     */   public bpx(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 275 */     this.a = paramInt1;
/* 276 */     this.b = paramInt2;
/* 277 */     this.c = paramInt3;
/* 278 */     this.d = paramInt4;
/*     */   }
/*     */   
/*     */   public bpw a() {
/* 282 */     return this.f;
/*     */   }
/*     */   
/*     */   public int b() {
/* 286 */     return this.a;
/*     */   }
/*     */   
/*     */   public int c() {
/* 290 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean a(bpw parambpw)
/*     */   {
/* 295 */     if (this.f != null) {
/* 296 */       return false;
/*     */     }
/*     */     
/* 299 */     int i = parambpw.b();
/* 300 */     int j = parambpw.c();
/*     */     
/*     */ 
/* 303 */     if ((i > this.c) || (j > this.d)) {
/* 304 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 308 */     if ((i == this.c) && (j == this.d))
/*     */     {
/* 310 */       this.f = parambpw;
/* 311 */       return true;
/*     */     }
/*     */     
/*     */ 
/* 315 */     if (this.e == null) {
/* 316 */       this.e = new ArrayList(1);
/*     */       
/*     */ 
/* 319 */       this.e.add(new bpx(this.a, this.b, i, j));
/*     */       
/* 321 */       int k = this.c - i;
/* 322 */       int m = this.d - j;
/*     */       
/* 324 */       if ((m > 0) && (k > 0))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */         int n = Math.max(this.d, k);
/* 340 */         int i1 = Math.max(this.c, m);
/* 341 */         if (n >= i1) {
/* 342 */           this.e.add(new bpx(this.a, this.b + j, i, m));
/* 343 */           this.e.add(new bpx(this.a + i, this.b, k, this.d));
/*     */         } else {
/* 345 */           this.e.add(new bpx(this.a + i, this.b, k, j));
/* 346 */           this.e.add(new bpx(this.a, this.b + j, this.c, m));
/*     */         }
/*     */       }
/* 349 */       else if (k == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */         this.e.add(new bpx(this.a, this.b + j, i, m));
/* 360 */       } else if (m == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */         this.e.add(new bpx(this.a + i, this.b, k, j));
/*     */       }
/*     */     }
/*     */     
/* 375 */     for (bpx localbpx : this.e) {
/* 376 */       if (localbpx.a(parambpw)) {
/* 377 */         return true;
/*     */       }
/*     */     }
/*     */     
/* 381 */     return false;
/*     */   }
/*     */   
/*     */   public void a(List paramList) {
/* 385 */     if (this.f != null) {
/* 386 */       paramList.add(this);
/* 387 */     } else if (this.e != null) {
/* 388 */       for (bpx localbpx : this.e) {
/* 389 */         localbpx.a(paramList);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 396 */     return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */