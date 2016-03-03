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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hg
/*    */   extends hf
/*    */ {
/*    */   public hg() {}
/*    */   
/*    */   public hg(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3)
/*    */   {
/* 67 */     super(paramInt);
/* 68 */     this.b = paramByte1;
/* 69 */     this.c = paramByte2;
/* 70 */     this.d = paramByte3;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 75 */     super.a(paramet);
/* 76 */     this.b = paramet.readByte();
/* 77 */     this.c = paramet.readByte();
/* 78 */     this.d = paramet.readByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 83 */     super.b(paramet);
/* 84 */     paramet.writeByte(this.b);
/* 85 */     paramet.writeByte(this.c);
/* 86 */     paramet.writeByte(this.d);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 91 */     return super.b() + String.format(", xa=%d, ya=%d, za=%d", new Object[] { Byte.valueOf(this.b), Byte.valueOf(this.c), Byte.valueOf(this.d) });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */