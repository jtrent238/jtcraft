/*    */ 
/*    */ public class ds
/*    */ {
/*  4 */   public static final ds a = new dt(0L);
/*    */   
/*    */ 
/*    */   private final long b;
/*    */   
/*    */ 
/*    */   private long c;
/*    */   
/*    */ 
/*    */   public ds(long paramLong)
/*    */   {
/* 15 */     this.b = paramLong;
/*    */   }
/*    */   
/*    */   public void a(long paramLong) {
/* 19 */     this.c += paramLong / 8L;
/* 20 */     if (this.c > this.b) {
/* 21 */       throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */