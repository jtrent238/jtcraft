/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
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
/*    */ public class aqj
/*    */ {
/* 38 */   private static final Map a = new HashMap();
/*    */   
/*    */ 
/*    */ 
/*    */   public static synchronized aqh a(File paramFile, int paramInt1, int paramInt2)
/*    */   {
/* 44 */     File localFile1 = new File(paramFile, "region");
/* 45 */     File localFile2 = new File(localFile1, "r." + (paramInt1 >> 5) + "." + (paramInt2 >> 5) + ".mca");
/*    */     
/* 47 */     aqh localaqh1 = (aqh)a.get(localFile2);
/* 48 */     if (localaqh1 != null) {
/* 49 */       return localaqh1;
/*    */     }
/*    */     
/* 52 */     if (!localFile1.exists()) {
/* 53 */       localFile1.mkdirs();
/*    */     }
/*    */     
/* 56 */     if (a.size() >= 256) {
/* 57 */       a();
/*    */     }
/*    */     
/* 60 */     aqh localaqh2 = new aqh(localFile2);
/* 61 */     a.put(localFile2, localaqh2);
/* 62 */     return localaqh2;
/*    */   }
/*    */   
/*    */   public static synchronized void a() {
/* 66 */     for (aqh localaqh : a.values()) {
/*    */       try {
/* 68 */         if (localaqh != null) {
/* 69 */           localaqh.c();
/*    */         }
/*    */       } catch (IOException localIOException) {
/* 72 */         localIOException.printStackTrace();
/*    */       }
/*    */     }
/* 75 */     a.clear();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static DataInputStream c(File paramFile, int paramInt1, int paramInt2)
/*    */   {
/* 84 */     aqh localaqh = a(paramFile, paramInt1, paramInt2);
/* 85 */     return localaqh.a(paramInt1 & 0x1F, paramInt2 & 0x1F);
/*    */   }
/*    */   
/*    */   public static DataOutputStream d(File paramFile, int paramInt1, int paramInt2) {
/* 89 */     aqh localaqh = a(paramFile, paramInt1, paramInt2);
/* 90 */     return localaqh.b(paramInt1 & 0x1F, paramInt2 & 0x1F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */