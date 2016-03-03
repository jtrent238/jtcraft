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
/*    */ public class hx
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public hx() {}
/*    */   
/*    */   public hx(int paramInt, sa paramsa1, sa paramsa2)
/*    */   {
/* 22 */     this.a = paramInt;
/* 23 */     this.b = paramsa1.y();
/* 24 */     this.c = (paramsa2 != null ? paramsa2.y() : -1);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.b = paramet.readInt();
/* 30 */     this.c = paramet.readInt();
/* 31 */     this.a = paramet.readUnsignedByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 36 */     paramet.writeInt(this.b);
/* 37 */     paramet.writeInt(this.c);
/* 38 */     paramet.writeByte(this.a);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 43 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 47 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 51 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 55 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */