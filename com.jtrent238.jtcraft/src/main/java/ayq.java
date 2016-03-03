/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.UUID;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class ayq
/*     */   implements azc, azp
/*     */ {
/*  15 */   private static final Logger a = ;
/*     */   private final File b;
/*     */   private final File c;
/*     */   private final File d;
/*  19 */   private final long e = MinecraftServer.ar();
/*     */   private final String f;
/*     */   
/*     */   public ayq(File paramFile, String paramString, boolean paramBoolean) {
/*  23 */     this.b = new File(paramFile, paramString);
/*  24 */     this.b.mkdirs();
/*  25 */     this.c = new File(this.b, "playerdata");
/*  26 */     this.d = new File(this.b, "data");
/*  27 */     this.d.mkdirs();
/*  28 */     this.f = paramString;
/*     */     
/*  30 */     if (paramBoolean) {
/*  31 */       this.c.mkdirs();
/*     */     }
/*     */     
/*  34 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/*     */     try {
/*  39 */       File localFile = new File(this.b, "session.lock");
/*  40 */       DataOutputStream localDataOutputStream = new DataOutputStream(new FileOutputStream(localFile));
/*     */       try {
/*  42 */         localDataOutputStream.writeLong(this.e);
/*     */       } finally {
/*  44 */         localDataOutputStream.close();
/*     */       }
/*     */     } catch (IOException localIOException) {
/*  47 */       localIOException.printStackTrace();
/*  48 */       throw new RuntimeException("Failed to check session lock, aborting");
/*     */     }
/*     */   }
/*     */   
/*     */   public File b()
/*     */   {
/*  54 */     return this.b;
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/*     */     try {
/*  60 */       File localFile = new File(this.b, "session.lock");
/*  61 */       DataInputStream localDataInputStream = new DataInputStream(new FileInputStream(localFile));
/*     */       try {
/*  63 */         if (localDataInputStream.readLong() != this.e) {
/*  64 */           throw new ahg("The save is being accessed from another location, aborting");
/*     */         }
/*     */       } finally {
/*  67 */         localDataInputStream.close();
/*     */       }
/*     */     } catch (IOException localIOException) {
/*  70 */       throw new ahg("Failed to check session lock, aborting");
/*     */     }
/*     */   }
/*     */   
/*     */   public aqc a(aqo paramaqo)
/*     */   {
/*  76 */     throw new RuntimeException("Old Chunk Storage is no longer supported.");
/*     */   }
/*     */   
/*     */   public ays d()
/*     */   {
/*  81 */     File localFile = new File(this.b, "level.dat");
/*  82 */     dh localdh3; if (localFile.exists()) {
/*     */       try {
/*  84 */         dh localdh1 = du.a(new FileInputStream(localFile));
/*  85 */         localdh3 = localdh1.m("Data");
/*     */         
/*  87 */         return new ays(localdh3);
/*     */       }
/*     */       catch (Exception localException1) {
/*  90 */         localException1.printStackTrace();
/*     */       }
/*     */     }
/*  93 */     localFile = new File(this.b, "level.dat_old");
/*  94 */     if (localFile.exists()) {
/*     */       try {
/*  96 */         dh localdh2 = du.a(new FileInputStream(localFile));
/*  97 */         localdh3 = localdh2.m("Data");
/*     */         
/*  99 */         return new ays(localdh3);
/*     */       }
/*     */       catch (Exception localException2) {
/* 102 */         localException2.printStackTrace();
/*     */       }
/*     */     }
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ays paramays, dh paramdh)
/*     */   {
/* 110 */     dh localdh1 = paramays.a(paramdh);
/*     */     
/* 112 */     dh localdh2 = new dh();
/* 113 */     localdh2.a("Data", localdh1);
/*     */     try
/*     */     {
/* 116 */       File localFile1 = new File(this.b, "level.dat_new");
/* 117 */       File localFile2 = new File(this.b, "level.dat_old");
/* 118 */       File localFile3 = new File(this.b, "level.dat");
/*     */       
/* 120 */       du.a(localdh2, new FileOutputStream(localFile1));
/*     */       
/* 122 */       if (localFile2.exists()) localFile2.delete();
/* 123 */       localFile3.renameTo(localFile2);
/* 124 */       if (localFile3.exists()) localFile3.delete();
/* 125 */       localFile1.renameTo(localFile3);
/* 126 */       if (localFile1.exists()) localFile1.delete();
/*     */     } catch (Exception localException) {
/* 128 */       localException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ays paramays)
/*     */   {
/* 134 */     dh localdh1 = paramays.a();
/*     */     
/* 136 */     dh localdh2 = new dh();
/* 137 */     localdh2.a("Data", localdh1);
/*     */     try
/*     */     {
/* 140 */       File localFile1 = new File(this.b, "level.dat_new");
/* 141 */       File localFile2 = new File(this.b, "level.dat_old");
/* 142 */       File localFile3 = new File(this.b, "level.dat");
/*     */       
/* 144 */       du.a(localdh2, new FileOutputStream(localFile1));
/*     */       
/* 146 */       if (localFile2.exists()) localFile2.delete();
/* 147 */       localFile3.renameTo(localFile2);
/* 148 */       if (localFile3.exists()) localFile3.delete();
/* 149 */       localFile1.renameTo(localFile3);
/* 150 */       if (localFile1.exists()) localFile1.delete();
/*     */     } catch (Exception localException) {
/* 152 */       localException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(yz paramyz)
/*     */   {
/*     */     try {
/* 159 */       dh localdh = new dh();
/* 160 */       paramyz.e(localdh);
/* 161 */       File localFile1 = new File(this.c, paramyz.aB().toString() + ".dat.tmp");
/* 162 */       File localFile2 = new File(this.c, paramyz.aB().toString() + ".dat");
/* 163 */       du.a(localdh, new FileOutputStream(localFile1));
/* 164 */       if (localFile2.exists()) localFile2.delete();
/* 165 */       localFile1.renameTo(localFile2);
/*     */     } catch (Exception localException) {
/* 167 */       a.warn("Failed to save player data for " + paramyz.b_());
/*     */     }
/*     */   }
/*     */   
/*     */   public dh b(yz paramyz)
/*     */   {
/* 173 */     dh localdh = null;
/*     */     try {
/* 175 */       File localFile = new File(this.c, paramyz.aB().toString() + ".dat");
/* 176 */       if ((localFile.exists()) && (localFile.isFile())) {
/* 177 */         localdh = du.a(new FileInputStream(localFile));
/*     */       }
/*     */     } catch (Exception localException) {
/* 180 */       a.warn("Failed to load player data for " + paramyz.b_());
/*     */     }
/* 182 */     if (localdh != null) {
/* 183 */       paramyz.f(localdh);
/*     */     }
/* 185 */     return localdh;
/*     */   }
/*     */   
/*     */   public azp e()
/*     */   {
/* 190 */     return this;
/*     */   }
/*     */   
/*     */   public String[] f()
/*     */   {
/* 195 */     String[] arrayOfString = this.c.list();
/*     */     
/* 197 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 198 */       if (arrayOfString[i].endsWith(".dat")) {
/* 199 */         arrayOfString[i] = arrayOfString[i].substring(0, arrayOfString[i].length() - 4);
/*     */       }
/*     */     }
/*     */     
/* 203 */     return arrayOfString;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a() {}
/*     */   
/*     */ 
/*     */   public File a(String paramString)
/*     */   {
/* 212 */     return new File(this.d, paramString + ".dat");
/*     */   }
/*     */   
/*     */   public String g()
/*     */   {
/* 217 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */