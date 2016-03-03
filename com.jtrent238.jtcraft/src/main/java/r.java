/*     */ 
/*     */ 
/*     */ public class r
/*     */   implements Comparable
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   
/*     */   public r() {}
/*     */   
/*     */   public r(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  14 */     this.a = paramInt1;
/*  15 */     this.b = paramInt2;
/*  16 */     this.c = paramInt3;
/*     */   }
/*     */   
/*     */   public r(r paramr) {
/*  20 */     this.a = paramr.a;
/*  21 */     this.b = paramr.b;
/*  22 */     this.c = paramr.c;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/*  27 */     if (!(paramObject instanceof r)) {
/*  28 */       return false;
/*     */     }
/*     */     
/*  31 */     r localr = (r)paramObject;
/*  32 */     return (this.a == localr.a) && (this.b == localr.b) && (this.c == localr.c);
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/*  37 */     return this.a + this.c << 8 + this.b << 16;
/*     */   }
/*     */   
/*     */   public int a(r paramr)
/*     */   {
/*  42 */     if (this.b == paramr.b) {
/*  43 */       if (this.c == paramr.c) {
/*  44 */         return this.a - paramr.a;
/*     */       }
/*  46 */       return this.c - paramr.c;
/*     */     }
/*  48 */     return this.b - paramr.b;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  56 */     this.a = paramInt1;
/*  57 */     this.b = paramInt2;
/*  58 */     this.c = paramInt3;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public float e(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 200 */     float f1 = this.a - paramInt1;
/* 201 */     float f2 = this.b - paramInt2;
/* 202 */     float f3 = this.c - paramInt3;
/* 203 */     return f1 * f1 + f2 * f2 + f3 * f3;
/*     */   }
/*     */   
/*     */   public float e(r paramr) {
/* 207 */     return e(paramr.a, paramr.b, paramr.c);
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 212 */     return "Pos{x=" + this.a + ", y=" + this.b + ", z=" + this.c + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */