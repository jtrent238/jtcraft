/*    */ import java.io.File;
/*    */ import java.io.FileFilter;
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
/*    */ final class brd
/*    */   implements FileFilter
/*    */ {
/*    */   public boolean accept(File paramFile)
/*    */   {
/* 32 */     int i = (paramFile.isFile()) && (paramFile.getName().endsWith(".zip")) ? 1 : 0;
/* 33 */     int j = (paramFile.isDirectory()) && (new File(paramFile, "pack.mcmeta").isFile()) ? 1 : 0;
/*    */     
/* 35 */     return (i != 0) || (j != 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */