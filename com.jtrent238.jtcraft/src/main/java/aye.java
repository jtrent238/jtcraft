/*    */ 
/*    */ 
/*    */ public class aye
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   private final int j;
/*  9 */   int d = -1;
/*    */   float e;
/*    */   float f;
/*    */   
/*    */   public aye(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 15 */     this.a = paramInt1;
/* 16 */     this.b = paramInt2;
/* 17 */     this.c = paramInt3;
/*    */     
/* 19 */     this.j = a(paramInt1, paramInt2, paramInt3); }
/*    */   
/*    */   float g;
/*    */   
/* 23 */   public static int a(int paramInt1, int paramInt2, int paramInt3) { return paramInt2 & 0xFF | (paramInt1 & 0x7FFF) << 8 | (paramInt3 & 0x7FFF) << 24 | (paramInt1 < 0 ? Integer.MIN_VALUE : 0) | (paramInt3 < 0 ? 32768 : 0); }
/*    */   
/*    */   aye h;
/*    */   public boolean i;
/* 27 */   public float a(aye paramaye) { float f1 = paramaye.a - this.a;
/* 28 */     float f2 = paramaye.b - this.b;
/* 29 */     float f3 = paramaye.c - this.c;
/* 30 */     return qh.c(f1 * f1 + f2 * f2 + f3 * f3);
/*    */   }
/*    */   
/*    */   public float b(aye paramaye) {
/* 34 */     float f1 = paramaye.a - this.a;
/* 35 */     float f2 = paramaye.b - this.b;
/* 36 */     float f3 = paramaye.c - this.c;
/* 37 */     return f1 * f1 + f2 * f2 + f3 * f3;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 41 */     if ((paramObject instanceof aye)) {
/* 42 */       aye localaye = (aye)paramObject;
/* 43 */       return (this.j == localaye.j) && (this.a == localaye.a) && (this.b == localaye.b) && (this.c == localaye.c);
/*    */     }
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 49 */     return this.j;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 53 */     return this.d >= 0;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 57 */     return this.a + ", " + this.b + ", " + this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */