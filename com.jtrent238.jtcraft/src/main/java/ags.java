/*    */ public class ags
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private aji d;
/*    */   private int e;
/*    */   private int f;
/*    */   
/*    */   public ags(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5)
/*    */   {
/* 12 */     this.a = paramInt1;
/* 13 */     this.b = paramInt2;
/* 14 */     this.c = paramInt3;
/* 15 */     this.e = paramInt4;
/* 16 */     this.f = paramInt5;
/* 17 */     this.d = paramaji;
/*    */   }
/*    */   
/*    */   public int a() {
/* 21 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 25 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 29 */     return this.c;
/*    */   }
/*    */   
/*    */   public int d() {
/* 33 */     return this.e;
/*    */   }
/*    */   
/*    */   public int e() {
/* 37 */     return this.f;
/*    */   }
/*    */   
/*    */   public aji f() {
/* 41 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 46 */     if ((paramObject instanceof ags)) {
/* 47 */       ags localags = (ags)paramObject;
/* 48 */       return (this.a == localags.a) && (this.b == localags.b) && (this.c == localags.c) && (this.e == localags.e) && (this.f == localags.f) && (this.d == localags.d);
/*    */     }
/* 50 */     return false;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 55 */     return "TE(" + this.a + "," + this.b + "," + this.c + ")," + this.e + "," + this.f + "," + this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */