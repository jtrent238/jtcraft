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
/*    */ public class jj
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public jj() {}
/*    */   
/*    */   public jj(sa paramsa, int paramInt)
/*    */   {
/* 26 */     this(paramsa, paramInt, 0);
/*    */   }
/*    */   
/*    */   public jj(sa paramsa, int paramInt1, int paramInt2) {
/* 30 */     this.a = paramsa.y();
/* 31 */     this.b = paramInt1;
/* 32 */     this.c = paramInt2;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 37 */     this.a = paramet.readInt();
/* 38 */     this.b = paramet.readByte();
/* 39 */     this.c = paramet.readInt();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 44 */     paramet.writeInt(this.a);
/* 45 */     paramet.writeByte(this.b);
/* 46 */     paramet.writeInt(this.c);
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 51 */     paramio.a(this);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public int d()
/*    */   {
/* 59 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 63 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */