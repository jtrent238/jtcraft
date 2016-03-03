/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gq
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private add c;
/*    */   
/*    */   public gq() {}
/*    */   
/*    */   public gq(int paramInt1, int paramInt2, add paramadd)
/*    */   {
/* 20 */     this.a = paramInt1;
/* 21 */     this.b = paramInt2;
/* 22 */     this.c = (paramadd == null ? null : paramadd.m());
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 27 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.readByte();
/* 33 */     this.b = paramet.readShort();
/* 34 */     this.c = paramet.c();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 39 */     paramet.writeByte(this.a);
/* 40 */     paramet.writeShort(this.b);
/* 41 */     paramet.a(this.c);
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
/*    */   public add e() {
/* 53 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */