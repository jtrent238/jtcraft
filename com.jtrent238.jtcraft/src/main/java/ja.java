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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ja
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private jb b;
/*    */   
/*    */   public ja() {}
/*    */   
/*    */   public ja(sa paramsa, jb paramjb)
/*    */   {
/* 37 */     this.a = paramsa.y();
/* 38 */     this.b = paramjb;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 43 */     this.a = paramet.readInt();
/* 44 */     this.b = jb.a()[(paramet.readByte() % jb.a().length)];
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 49 */     paramet.writeInt(this.a);
/* 50 */     paramet.writeByte(jb.a(this.b));
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 55 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public sa a(ahb paramahb) {
/* 59 */     return paramahb.a(this.a);
/*    */   }
/*    */   
/*    */   public jb c() {
/* 63 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */