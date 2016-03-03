/*    */ 
/*    */ 
/*    */ public class ahs
/*    */   implements Comparable
/*    */ {
/*    */   private static long f;
/*    */   private final aji g;
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public long d;
/*    */   public int e;
/* 13 */   private long h = f++;
/*    */   
/*    */   public ahs(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/* 16 */     this.a = paramInt1;
/* 17 */     this.b = paramInt2;
/* 18 */     this.c = paramInt3;
/* 19 */     this.g = paramaji;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 23 */     if ((paramObject instanceof ahs)) {
/* 24 */       ahs localahs = (ahs)paramObject;
/* 25 */       return (this.a == localahs.a) && (this.b == localahs.b) && (this.c == localahs.c) && (aji.a(this.g, localahs.g));
/*    */     }
/* 27 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 31 */     return (this.a * 1024 * 1024 + this.c * 1024 + this.b) * 256;
/*    */   }
/*    */   
/*    */   public ahs a(long paramLong) {
/* 35 */     this.d = paramLong;
/* 36 */     return this;
/*    */   }
/*    */   
/*    */   public void a(int paramInt) {
/* 40 */     this.e = paramInt;
/*    */   }
/*    */   
/*    */   public int a(ahs paramahs)
/*    */   {
/* 45 */     if (this.d < paramahs.d) return -1;
/* 46 */     if (this.d > paramahs.d) return 1;
/* 47 */     if (this.e != paramahs.e) return this.e - paramahs.e;
/* 48 */     if (this.h < paramahs.h) return -1;
/* 49 */     if (this.h > paramahs.h) return 1;
/* 50 */     return 0;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 54 */     return aji.b(this.g) + ": (" + this.a + ", " + this.b + ", " + this.c + "), " + this.d + ", " + this.e + ", " + this.h;
/*    */   }
/*    */   
/*    */   public aji a() {
/* 58 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */