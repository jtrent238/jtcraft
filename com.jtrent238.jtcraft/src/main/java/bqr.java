/*    */ import com.google.common.base.Splitter;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.Enumeration;
/*    */ import java.util.HashSet;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipFile;
/*    */ 
/*    */ public class bqr extends bqn implements Closeable
/*    */ {
/* 19 */   public static final Splitter b = Splitter.on('/').omitEmptyStrings().limit(3);
/*    */   private ZipFile c;
/*    */   
/*    */   public bqr(File paramFile) {
/* 23 */     super(paramFile);
/*    */   }
/*    */   
/*    */   private ZipFile d() {
/* 27 */     if (this.c == null) {
/* 28 */       this.c = new ZipFile(this.a);
/*    */     }
/*    */     
/* 31 */     return this.c;
/*    */   }
/*    */   
/*    */   protected InputStream a(String paramString)
/*    */   {
/* 36 */     ZipFile localZipFile = d();
/* 37 */     ZipEntry localZipEntry = localZipFile.getEntry(paramString);
/*    */     
/* 39 */     if (localZipEntry == null) {
/* 40 */       throw new brb(this.a, paramString);
/*    */     }
/*    */     
/* 43 */     return localZipFile.getInputStream(localZipEntry);
/*    */   }
/*    */   
/*    */   public boolean b(String paramString)
/*    */   {
/*    */     try {
/* 49 */       return d().getEntry(paramString) != null;
/*    */     } catch (IOException localIOException) {}
/* 51 */     return false;
/*    */   }
/*    */   
/*    */   public Set c()
/*    */   {
/*    */     ZipFile localZipFile;
/*    */     try
/*    */     {
/* 59 */       localZipFile = d();
/*    */     } catch (IOException localIOException) {
/* 61 */       return Collections.emptySet();
/*    */     }
/*    */     
/* 64 */     Enumeration localEnumeration = localZipFile.entries();
/*    */     
/* 66 */     HashSet localHashSet = Sets.newHashSet();
/*    */     
/* 68 */     while (localEnumeration.hasMoreElements()) {
/* 69 */       ZipEntry localZipEntry = (ZipEntry)localEnumeration.nextElement();
/*    */       
/* 71 */       String str1 = localZipEntry.getName();
/* 72 */       if (str1.startsWith("assets/")) {
/* 73 */         ArrayList localArrayList = Lists.newArrayList(b.split(str1));
/* 74 */         if (localArrayList.size() > 1) {
/* 75 */           String str2 = (String)localArrayList.get(1);
/* 76 */           if (!str2.equals(str2.toLowerCase())) {
/* 77 */             c(str2);
/*    */           } else {
/* 79 */             localHashSet.add(str2);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 85 */     return localHashSet;
/*    */   }
/*    */   
/*    */   protected void finalize()
/*    */   {
/* 90 */     close();
/* 91 */     super.finalize();
/*    */   }
/*    */   
/*    */   public void close()
/*    */   {
/* 96 */     if (this.c != null) {
/* 97 */       this.c.close();
/* 98 */       this.c = null;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */