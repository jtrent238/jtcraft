/*    */ 
/*    */ 
/*    */ public class azf
/*    */   implements Comparable
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final long c;
/*    */   private final long d;
/*    */   private final boolean e;
/*    */   private final ahk f;
/*    */   private final boolean g;
/*    */   private final boolean h;
/*    */   
/*    */   public azf(String paramString1, String paramString2, long paramLong1, long paramLong2, ahk paramahk, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*    */   {
/* 17 */     this.a = paramString1;
/* 18 */     this.b = paramString2;
/* 19 */     this.c = paramLong1;
/* 20 */     this.d = paramLong2;
/* 21 */     this.f = paramahk;
/* 22 */     this.e = paramBoolean1;
/* 23 */     this.g = paramBoolean2;
/* 24 */     this.h = paramBoolean3;
/*    */   }
/*    */   
/*    */   public String a() {
/* 28 */     return this.a;
/*    */   }
/*    */   
/*    */   public String b() {
/* 32 */     return this.b;
/*    */   }
/*    */   
/*    */   public long c() {
/* 36 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 40 */     return this.e;
/*    */   }
/*    */   
/*    */   public long e() {
/* 44 */     return this.c;
/*    */   }
/*    */   
/*    */   public int a(azf paramazf)
/*    */   {
/* 49 */     if (this.c < paramazf.c) {
/* 50 */       return 1;
/*    */     }
/* 52 */     if (this.c > paramazf.c) {
/* 53 */       return -1;
/*    */     }
/* 55 */     return this.a.compareTo(paramazf.a);
/*    */   }
/*    */   
/*    */   public ahk f() {
/* 59 */     return this.f;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 63 */     return this.g;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 67 */     return this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\azf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */