/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ayn
/*     */   extends ayr
/*     */ {
/*  17 */   private static final Logger b = ;
/*     */   
/*     */   public ayn(File paramFile) {
/*  20 */     super(paramFile);
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/*  25 */     return "Anvil";
/*     */   }
/*     */   
/*     */ 
/*     */   public List b()
/*     */   {
/*  31 */     if ((this.a == null) || (!this.a.exists()) || (!this.a.isDirectory())) {
/*  32 */       throw new azd("Unable to read or access folder where game worlds are saved!");
/*     */     }
/*     */     
/*  35 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  37 */     File[] arrayOfFile1 = this.a.listFiles();
/*  38 */     for (File localFile : arrayOfFile1) {
/*  39 */       if (localFile.isDirectory())
/*     */       {
/*     */ 
/*     */ 
/*  43 */         String str1 = localFile.getName();
/*     */         
/*  45 */         ays localays = c(str1);
/*  46 */         if ((localays != null) && ((localays.l() == 19132) || (localays.l() == 19133))) {
/*  47 */           boolean bool = localays.l() != c();
/*  48 */           String str2 = localays.k();
/*  49 */           if ((str2 == null) || (qh.a(str2))) {
/*  50 */             str2 = str1;
/*     */           }
/*  52 */           long l = 0L;
/*  53 */           localArrayList.add(new azf(str1, str2, localays.m(), l, localays.r(), bool, localays.t(), localays.v()));
/*     */         }
/*     */       }
/*     */     }
/*  57 */     return localArrayList;
/*     */   }
/*     */   
/*     */   protected int c() {
/*  61 */     return 19133;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void d() {}
/*     */   
/*     */ 
/*     */   public azc a(String paramString, boolean paramBoolean)
/*     */   {
/*  71 */     return new aym(this.a, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean a(String paramString)
/*     */   {
/*  78 */     ays localays = c(paramString);
/*  79 */     if ((localays == null) || (localays.l() != 19132)) {
/*  80 */       return false;
/*     */     }
/*     */     
/*  83 */     return true;
/*     */   }
/*     */   
/*     */   public boolean b(String paramString)
/*     */   {
/*  88 */     ays localays = c(paramString);
/*  89 */     if ((localays == null) || (localays.l() == c())) {
/*  90 */       return false;
/*     */     }
/*  92 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(String paramString, qk paramqk)
/*     */   {
/*  98 */     paramqk.a(0);
/*     */     
/* 100 */     ArrayList localArrayList1 = new ArrayList();
/* 101 */     ArrayList localArrayList2 = new ArrayList();
/* 102 */     ArrayList localArrayList3 = new ArrayList();
/* 103 */     File localFile1 = new File(this.a, paramString);
/* 104 */     File localFile2 = new File(localFile1, "DIM-1");
/* 105 */     File localFile3 = new File(localFile1, "DIM1");
/*     */     
/* 107 */     b.info("Scanning folders...");
/*     */     
/*     */ 
/* 110 */     a(localFile1, localArrayList1);
/*     */     
/*     */ 
/* 113 */     if (localFile2.exists()) {
/* 114 */       a(localFile2, localArrayList2);
/*     */     }
/* 116 */     if (localFile3.exists()) {
/* 117 */       a(localFile3, localArrayList3);
/*     */     }
/*     */     
/* 120 */     int i = localArrayList1.size() + localArrayList2.size() + localArrayList3.size();
/* 121 */     b.info("Total conversion count is " + i);
/*     */     
/* 123 */     ays localays = c(paramString);
/*     */     
/* 125 */     Object localObject = null;
/* 126 */     if (localays.u() == ahm.c) {
/* 127 */       localObject = new aie(ahu.p, 0.5F);
/*     */     } else {
/* 129 */       localObject = new aib(localays.b(), localays.u());
/*     */     }
/*     */     
/*     */ 
/* 133 */     a(new File(localFile1, "region"), localArrayList1, (aib)localObject, 0, i, paramqk);
/*     */     
/* 135 */     a(new File(localFile2, "region"), localArrayList2, new aie(ahu.w, 0.0F), localArrayList1.size(), i, paramqk);
/*     */     
/* 137 */     a(new File(localFile3, "region"), localArrayList3, new aie(ahu.x, 0.0F), localArrayList1.size() + localArrayList2.size(), i, paramqk);
/*     */     
/* 139 */     localays.e(19133);
/* 140 */     if (localays.u() == ahm.f) {
/* 141 */       localays.a(ahm.b);
/*     */     }
/*     */     
/* 144 */     g(paramString);
/*     */     
/* 146 */     azc localazc = a(paramString, false);
/* 147 */     localazc.a(localays);
/*     */     
/* 149 */     return true;
/*     */   }
/*     */   
/*     */   private void g(String paramString) {
/* 153 */     File localFile1 = new File(this.a, paramString);
/* 154 */     if (!localFile1.exists()) {
/* 155 */       b.warn("Unable to create level.dat_mcr backup");
/* 156 */       return;
/*     */     }
/*     */     
/* 159 */     File localFile2 = new File(localFile1, "level.dat");
/* 160 */     if (!localFile2.exists()) {
/* 161 */       b.warn("Unable to create level.dat_mcr backup");
/* 162 */       return;
/*     */     }
/*     */     
/* 165 */     File localFile3 = new File(localFile1, "level.dat_mcr");
/* 166 */     if (!localFile2.renameTo(localFile3)) {
/* 167 */       b.warn("Unable to create level.dat_mcr backup");
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(File paramFile, Iterable paramIterable, aib paramaib, int paramInt1, int paramInt2, qk paramqk)
/*     */   {
/* 173 */     for (File localFile : paramIterable) {
/* 174 */       a(paramFile, localFile, paramaib, paramInt1, paramInt2, paramqk);
/*     */       
/* 176 */       paramInt1++;
/* 177 */       int i = (int)Math.round(100.0D * paramInt1 / paramInt2);
/* 178 */       paramqk.a(i);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(File paramFile1, File paramFile2, aib paramaib, int paramInt1, int paramInt2, qk paramqk)
/*     */   {
/*     */     try
/*     */     {
/* 186 */       String str = paramFile2.getName();
/*     */       
/* 188 */       aqh localaqh1 = new aqh(paramFile2);
/* 189 */       aqh localaqh2 = new aqh(new File(paramFile1, str.substring(0, str.length() - ".mcr".length()) + ".mca"));
/*     */       
/* 191 */       for (int i = 0; i < 32; i++) {
/* 192 */         for (int j = 0; j < 32; j++)
/* 193 */           if ((localaqh1.c(i, j)) && (!localaqh2.c(i, j))) {
/* 194 */             DataInputStream localDataInputStream = localaqh1.a(i, j);
/* 195 */             if (localDataInputStream == null) {
/* 196 */               b.warn("Failed to fetch input stream");
/*     */             }
/*     */             else {
/* 199 */               dh localdh1 = du.a(localDataInputStream);
/* 200 */               localDataInputStream.close();
/*     */               
/* 202 */               dh localdh2 = localdh1.m("Level");
/* 203 */               aqg localaqg = aqf.a(localdh2);
/*     */               
/* 205 */               dh localdh3 = new dh();
/* 206 */               dh localdh4 = new dh();
/* 207 */               localdh3.a("Level", localdh4);
/* 208 */               aqf.a(localaqg, localdh4, paramaib);
/*     */               
/* 210 */               DataOutputStream localDataOutputStream = localaqh2.b(i, j);
/* 211 */               du.a(localdh3, localDataOutputStream);
/* 212 */               localDataOutputStream.close();
/*     */             }
/*     */           }
/* 215 */         j = (int)Math.round(100.0D * (paramInt1 * 1024) / (paramInt2 * 1024));
/* 216 */         int k = (int)Math.round(100.0D * ((i + 1) * 32 + paramInt1 * 1024) / (paramInt2 * 1024));
/* 217 */         if (k > j) {
/* 218 */           paramqk.a(k);
/*     */         }
/*     */       }
/*     */       
/* 222 */       localaqh1.c();
/* 223 */       localaqh2.c();
/*     */     } catch (IOException localIOException) {
/* 225 */       localIOException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(File paramFile, Collection paramCollection)
/*     */   {
/* 231 */     File localFile = new File(paramFile, "region");
/* 232 */     File[] arrayOfFile = localFile.listFiles(new ayo(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */     if (arrayOfFile != null) {
/* 240 */       Collections.addAll(paramCollection, arrayOfFile);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */