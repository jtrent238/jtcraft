/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gp
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public gp() {}
/*    */   
/*    */   public gp(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     this.a = paramInt1;
/* 20 */     this.b = paramInt2;
/* 21 */     this.c = paramInt3;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 26 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 31 */     this.a = paramet.readUnsignedByte();
/* 32 */     this.b = paramet.readShort();
/* 33 */     this.c = paramet.readShort();
/*    */   }
/*    */   
/*    */ 
/*    */   public void b(et paramet)
/*    */   {
/* 39 */     paramet.writeByte(this.a);
/* 40 */     paramet.writeShort(this.b);
/* 41 */     paramet.writeShort(this.c);
/*    */   }
/*    */   
/*    */   public int c() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 49 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 53 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */