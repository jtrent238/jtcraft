/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hp
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public hp() {}
/*    */   
/*    */   public hp(yz paramyz, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 23 */     this.b = paramInt1;
/* 24 */     this.c = paramInt2;
/* 25 */     this.d = paramInt3;
/* 26 */     this.a = paramyz.y();
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 31 */     this.a = paramet.readInt();
/* 32 */     this.b = paramet.readInt();
/* 33 */     this.c = paramet.readByte();
/* 34 */     this.d = paramet.readInt();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 39 */     paramet.writeInt(this.a);
/* 40 */     paramet.writeInt(this.b);
/* 41 */     paramet.writeByte(this.c);
/* 42 */     paramet.writeInt(this.d);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 47 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public yz a(ahb paramahb) {
/* 51 */     return (yz)paramahb.a(this.a);
/*    */   }
/*    */   
/*    */   public int c() {
/* 55 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 59 */     return this.c;
/*    */   }
/*    */   
/*    */   public int e() {
/* 63 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */