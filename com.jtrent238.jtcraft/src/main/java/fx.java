/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fx
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   public fx() {}
/*    */   
/*    */   public fx(sq paramsq)
/*    */   {
/* 23 */     this.a = paramsq.y();
/* 24 */     this.b = qh.c(paramsq.s * 32.0D);
/* 25 */     this.c = qh.c(paramsq.t * 32.0D);
/* 26 */     this.d = qh.c(paramsq.u * 32.0D);
/* 27 */     this.e = paramsq.e();
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.a();
/* 33 */     this.b = paramet.readInt();
/* 34 */     this.c = paramet.readInt();
/* 35 */     this.d = paramet.readInt();
/* 36 */     this.e = paramet.readShort();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 41 */     paramet.b(this.a);
/* 42 */     paramet.writeInt(this.b);
/* 43 */     paramet.writeInt(this.c);
/* 44 */     paramet.writeInt(this.d);
/* 45 */     paramet.writeShort(this.e);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 50 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 55 */     return String.format("id=%d, value=%d, x=%.2f, y=%.2f, z=%.2f", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.e), Float.valueOf(this.b / 32.0F), Float.valueOf(this.c / 32.0F), Float.valueOf(this.d / 32.0F) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 63 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 71 */     return this.d;
/*    */   }
/*    */   
/*    */   public int g() {
/* 75 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */