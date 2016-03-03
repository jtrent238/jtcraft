/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aym
/*    */   extends ayq
/*    */ {
/*    */   public aym(File paramFile, String paramString, boolean paramBoolean)
/*    */   {
/* 16 */     super(paramFile, paramString, paramBoolean);
/*    */   }
/*    */   
/*    */ 
/*    */   public aqc a(aqo paramaqo)
/*    */   {
/* 22 */     File localFile1 = b();
/*    */     File localFile2;
/* 24 */     if ((paramaqo instanceof aqp)) {
/* 25 */       localFile2 = new File(localFile1, "DIM-1");
/* 26 */       localFile2.mkdirs();
/* 27 */       return new aqk(localFile2);
/*    */     }
/* 29 */     if ((paramaqo instanceof aqr)) {
/* 30 */       localFile2 = new File(localFile1, "DIM1");
/* 31 */       localFile2.mkdirs();
/* 32 */       return new aqk(localFile2);
/*    */     }
/*    */     
/* 35 */     return new aqk(localFile1);
/*    */   }
/*    */   
/*    */   public void a(ays paramays, dh paramdh)
/*    */   {
/* 40 */     paramays.e(19133);
/* 41 */     super.a(paramays, paramdh);
/*    */   }
/*    */   
/*    */   public void a()
/*    */   {
/*    */     try {
/* 47 */       azr.a.a();
/*    */     } catch (InterruptedException localInterruptedException) {
/* 49 */       localInterruptedException.printStackTrace();
/*    */     }
/*    */     
/* 52 */     aqj.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */