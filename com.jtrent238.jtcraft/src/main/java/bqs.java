/*    */ import com.google.common.collect.Sets;
/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.File;
/*    */ import java.io.InputStream;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class bqs extends bqn
/*    */ {
/*    */   public bqs(File paramFile)
/*    */   {
/* 11 */     super(paramFile);
/*    */   }
/*    */   
/*    */   protected InputStream a(String paramString)
/*    */   {
/* 16 */     return new BufferedInputStream(new java.io.FileInputStream(new File(this.a, paramString)));
/*    */   }
/*    */   
/*    */   protected boolean b(String paramString)
/*    */   {
/* 21 */     return new File(this.a, paramString).isFile();
/*    */   }
/*    */   
/*    */   public Set c()
/*    */   {
/* 26 */     java.util.HashSet localHashSet = Sets.newHashSet();
/* 27 */     File localFile1 = new File(this.a, "assets/");
/*    */     
/* 29 */     if (localFile1.isDirectory()) {
/* 30 */       for (File localFile2 : localFile1.listFiles(org.apache.commons.io.filefilter.DirectoryFileFilter.DIRECTORY)) {
/* 31 */         String str = a(localFile1, localFile2);
/*    */         
/* 33 */         if (!str.equals(str.toLowerCase())) {
/* 34 */           c(str);
/*    */         } else {
/* 36 */           localHashSet.add(str.substring(0, str.length() - 1));
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 41 */     return localHashSet;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */