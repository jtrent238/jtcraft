/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hq
/*    */   extends ft
/*    */ {
/*    */   private int[] a;
/*    */   
/*    */   public hq() {}
/*    */   
/*    */   public hq(int... paramVarArgs)
/*    */   {
/* 19 */     this.a = paramVarArgs;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 24 */     this.a = new int[paramet.readByte()];
/*    */     
/* 26 */     for (int i = 0; i < this.a.length; i++) {
/* 27 */       this.a[i] = paramet.readInt();
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 33 */     paramet.writeByte(this.a.length);
/*    */     
/* 35 */     for (int i = 0; i < this.a.length; i++) {
/* 36 */       paramet.writeInt(this.a[i]);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 42 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 47 */     StringBuilder localStringBuilder = new StringBuilder();
/*    */     
/* 49 */     for (int i = 0; i < this.a.length; i++) {
/* 50 */       if (i > 0) localStringBuilder.append(", ");
/* 51 */       localStringBuilder.append(this.a[i]);
/*    */     }
/*    */     
/* 54 */     return String.format("entities=%d[%s]", new Object[] { Integer.valueOf(this.a.length), localStringBuilder });
/*    */   }
/*    */   
/*    */   public int[] c() {
/* 58 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */