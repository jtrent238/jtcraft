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
/*    */ public class gv
/*    */   extends ft
/*    */ {
/* 25 */   public static final String[] a = { "tile.bed.notValid", null, null, "gameMode.changed" };
/*    */   
/*    */   private int b;
/*    */   
/*    */   private float c;
/*    */   
/*    */ 
/*    */   public gv() {}
/*    */   
/*    */ 
/*    */   public gv(int paramInt, float paramFloat)
/*    */   {
/* 37 */     this.b = paramInt;
/* 38 */     this.c = paramFloat;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 43 */     this.b = paramet.readUnsignedByte();
/* 44 */     this.c = paramet.readFloat();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 49 */     paramet.writeByte(this.b);
/* 50 */     paramet.writeFloat(this.c);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 55 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 59 */     return this.b;
/*    */   }
/*    */   
/*    */   public float d() {
/* 63 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */