/*   */ import java.io.File;
/*   */ import java.io.FileNotFoundException;
/*   */ 
/*   */ public class brb extends FileNotFoundException
/*   */ {
/*   */   public brb(File paramFile, String paramString)
/*   */   {
/* 8 */     super(String.format("'%s' in ResourcePack '%s'", new Object[] { paramString, paramFile }));
/*   */   }
/*   */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */