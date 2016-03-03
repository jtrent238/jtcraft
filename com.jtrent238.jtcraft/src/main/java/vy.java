/*    */ public class vy {
/*    */   public final int a;
/*    */   public final int b;
/*    */   
/*  5 */   public vy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { this.a = paramInt1;
/*  6 */     this.b = paramInt2;
/*  7 */     this.c = paramInt3;
/*  8 */     this.d = paramInt4;
/*  9 */     this.e = paramInt5;
/* 10 */     this.f = paramInt6;
/*    */   }
/*    */   
/*    */ 
/*    */   public final int c;
/*    */   
/*    */   public final int d;
/*    */   
/*    */   public final int e;
/*    */   
/*    */   public int f;
/*    */   
/*    */   public boolean g;
/*    */   
/*    */   private int h;
/*    */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 27 */     int i = paramInt1 - this.a;
/* 28 */     int j = paramInt2 - this.b;
/* 29 */     int k = paramInt3 - this.c;
/* 30 */     return i * i + j * j + k * k;
/*    */   }
/*    */   
/*    */   public int c(int paramInt1, int paramInt2, int paramInt3) {
/* 34 */     int i = paramInt1 - this.a - this.d;
/* 35 */     int j = paramInt2 - this.b;
/* 36 */     int k = paramInt3 - this.c - this.e;
/* 37 */     return i * i + j * j + k * k;
/*    */   }
/*    */   
/*    */   public int a() {
/* 41 */     return this.a + this.d;
/*    */   }
/*    */   
/*    */   public int b() {
/* 45 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 49 */     return this.c + this.e;
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2) {
/* 53 */     int i = paramInt1 - this.a;
/* 54 */     int j = paramInt2 - this.c;
/* 55 */     return i * this.d + j * this.e >= 0;
/*    */   }
/*    */   
/*    */   public void d() {
/* 59 */     this.h = 0;
/*    */   }
/*    */   
/*    */   public void e() {
/* 63 */     this.h += 1;
/*    */   }
/*    */   
/*    */   public int f() {
/* 67 */     return this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */