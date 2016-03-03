/*    */ public class fs extends IllegalArgumentException
/*    */ {
/*    */   public fs(fr paramfr, String paramString)
/*    */   {
/*  5 */     super(String.format("Error parsing: %s: %s", new Object[] { paramfr, paramString }));
/*    */   }
/*    */   
/*    */   public fs(fr paramfr, int paramInt) {
/*  9 */     super(String.format("Invalid index %d requested for %s", new Object[] { Integer.valueOf(paramInt), paramfr }));
/*    */   }
/*    */   
/*    */   public fs(fr paramfr, Throwable paramThrowable) {
/* 13 */     super(String.format("Error while parsing: %s", new Object[] { paramfr }), paramThrowable);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */