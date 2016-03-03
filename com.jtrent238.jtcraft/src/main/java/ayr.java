/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class ayr
/*     */   implements aze
/*     */ {
/*  12 */   private static final Logger b = ;
/*     */   protected final File a;
/*     */   
/*     */   public ayr(File paramFile)
/*     */   {
/*  17 */     if (!paramFile.exists()) paramFile.mkdirs();
/*  18 */     this.a = paramFile;
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/*  23 */     return "Old Format";
/*     */   }
/*     */   
/*     */ 
/*     */   public List b()
/*     */   {
/*  29 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  31 */     for (int i = 0; i < 5; i++)
/*     */     {
/*  33 */       String str = "World" + (i + 1);
/*     */       
/*  35 */       ays localays = c(str);
/*  36 */       if (localays != null) {
/*  37 */         localArrayList.add(new azf(str, "", localays.m(), localays.h(), localays.r(), false, localays.t(), localays.v()));
/*     */       }
/*     */     }
/*     */     
/*  41 */     return localArrayList;
/*     */   }
/*     */   
/*     */ 
/*     */   public void d() {}
/*     */   
/*     */ 
/*     */   public ays c(String paramString)
/*     */   {
/*  50 */     File localFile1 = new File(this.a, paramString);
/*  51 */     if (!localFile1.exists()) { return null;
/*     */     }
/*  53 */     File localFile2 = new File(localFile1, "level.dat");
/*  54 */     dh localdh3; if (localFile2.exists()) {
/*     */       try {
/*  56 */         dh localdh1 = du.a(new FileInputStream(localFile2));
/*  57 */         localdh3 = localdh1.m("Data");
/*  58 */         return new ays(localdh3);
/*     */       } catch (Exception localException1) {
/*  60 */         b.error("Exception reading " + localFile2, localException1);
/*     */       }
/*     */     }
/*     */     
/*  64 */     localFile2 = new File(localFile1, "level.dat_old");
/*  65 */     if (localFile2.exists()) {
/*     */       try {
/*  67 */         dh localdh2 = du.a(new FileInputStream(localFile2));
/*  68 */         localdh3 = localdh2.m("Data");
/*  69 */         return new ays(localdh3);
/*     */       } catch (Exception localException2) {
/*  71 */         b.error("Exception reading " + localFile2, localException2);
/*     */       }
/*     */     }
/*  74 */     return null;
/*     */   }
/*     */   
/*     */   public void a(String paramString1, String paramString2)
/*     */   {
/*  79 */     File localFile1 = new File(this.a, paramString1);
/*  80 */     if (!localFile1.exists()) { return;
/*     */     }
/*  82 */     File localFile2 = new File(localFile1, "level.dat");
/*  83 */     if (localFile2.exists()) {
/*     */       try {
/*  85 */         dh localdh1 = du.a(new FileInputStream(localFile2));
/*  86 */         dh localdh2 = localdh1.m("Data");
/*  87 */         localdh2.a("LevelName", paramString2);
/*     */         
/*  89 */         du.a(localdh1, new FileOutputStream(localFile2));
/*     */       } catch (Exception localException) {
/*  91 */         localException.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean d(String paramString)
/*     */   {
/*  99 */     File localFile = new File(this.a, paramString);
/* 100 */     if (localFile.exists()) {
/* 101 */       return false;
/*     */     }
/*     */     try
/*     */     {
/* 105 */       localFile.mkdir();
/* 106 */       localFile.delete();
/*     */     } catch (Throwable localThrowable) {
/* 108 */       b.warn("Couldn't make new level", localThrowable);
/* 109 */       return false;
/*     */     }
/*     */     
/* 112 */     return true;
/*     */   }
/*     */   
/*     */   public boolean e(String paramString)
/*     */   {
/* 117 */     File localFile = new File(this.a, paramString);
/* 118 */     if (!localFile.exists()) { return true;
/*     */     }
/* 120 */     b.info("Deleting level " + paramString);
/*     */     
/* 122 */     for (int i = 1; i <= 5; i++) {
/* 123 */       b.info("Attempt " + i + "...");
/*     */       
/* 125 */       if (a(localFile.listFiles())) {
/*     */         break;
/*     */       }
/* 128 */       b.warn("Unsuccessful in deleting contents.");
/*     */       
/*     */ 
/* 131 */       if (i < 5) {
/*     */         try {
/* 133 */           Thread.sleep(500L);
/*     */         }
/*     */         catch (InterruptedException localInterruptedException) {}
/*     */       }
/*     */     }
/*     */     
/* 139 */     return localFile.delete();
/*     */   }
/*     */   
/*     */   protected static boolean a(File[] paramArrayOfFile) {
/* 143 */     for (int i = 0; i < paramArrayOfFile.length; i++) {
/* 144 */       File localFile = paramArrayOfFile[i];
/* 145 */       b.debug("Deleting " + localFile);
/*     */       
/* 147 */       if ((localFile.isDirectory()) && 
/* 148 */         (!a(localFile.listFiles()))) {
/* 149 */         b.warn("Couldn't delete directory " + localFile);
/* 150 */         return false;
/*     */       }
/*     */       
/*     */ 
/* 154 */       if (!localFile.delete()) {
/* 155 */         b.warn("Couldn't delete file " + localFile);
/* 156 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 160 */     return true;
/*     */   }
/*     */   
/*     */   public azc a(String paramString, boolean paramBoolean)
/*     */   {
/* 165 */     return new ayq(this.a, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean a(String paramString)
/*     */   {
/* 170 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(String paramString)
/*     */   {
/* 175 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(String paramString, qk paramqk)
/*     */   {
/* 180 */     return false;
/*     */   }
/*     */   
/*     */   public boolean f(String paramString)
/*     */   {
/* 185 */     File localFile = new File(this.a, paramString);
/* 186 */     return localFile.isDirectory();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */