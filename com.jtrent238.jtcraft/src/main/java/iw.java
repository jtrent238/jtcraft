/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class iw
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public iw() {}
/*    */   
/*    */   public iw(int paramInt1, int paramInt2)
/*    */   {
/* 16 */     this.a = paramInt1;
/* 17 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 22 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 27 */     this.a = paramet.readByte();
/* 28 */     this.b = paramet.readByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 33 */     paramet.writeByte(this.a);
/* 34 */     paramet.writeByte(this.b);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 39 */     return String.format("id=%d, button=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 43 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 47 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */