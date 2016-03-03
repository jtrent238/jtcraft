/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ga
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   private String f;
/*    */   
/*    */   public ga() {}
/*    */   
/*    */   public ga(tb paramtb)
/*    */   {
/* 23 */     this.a = paramtb.y();
/* 24 */     this.b = paramtb.b;
/* 25 */     this.c = paramtb.c;
/* 26 */     this.d = paramtb.d;
/* 27 */     this.e = paramtb.a;
/* 28 */     this.f = paramtb.e.B;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 33 */     this.a = paramet.a();
/* 34 */     this.f = paramet.c(tc.A);
/* 35 */     this.b = paramet.readInt();
/* 36 */     this.c = paramet.readInt();
/* 37 */     this.d = paramet.readInt();
/* 38 */     this.e = paramet.readInt();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 43 */     paramet.b(this.a);
/* 44 */     paramet.a(this.f);
/* 45 */     paramet.writeInt(this.b);
/* 46 */     paramet.writeInt(this.c);
/* 47 */     paramet.writeInt(this.d);
/* 48 */     paramet.writeInt(this.e);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 53 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 58 */     return String.format("id=%d, type=%s, x=%d, y=%d, z=%d", new Object[] { Integer.valueOf(this.a), this.f, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 62 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 66 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 70 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 74 */     return this.d;
/*    */   }
/*    */   
/*    */   public int g() {
/* 78 */     return this.e;
/*    */   }
/*    */   
/*    */   public String h() {
/* 82 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */