/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutput;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class azq
/*     */ {
/*     */   private azc a;
/*  21 */   private Map b = new HashMap();
/*  22 */   private List c = new ArrayList();
/*  23 */   private Map d = new HashMap();
/*     */   
/*     */   public azq(azc paramazc) {
/*  26 */     this.a = paramazc;
/*  27 */     b();
/*     */   }
/*     */   
/*     */   public ayl a(Class paramClass, String paramString) {
/*  31 */     ayl localayl = (ayl)this.b.get(paramString);
/*  32 */     if (localayl != null) { return localayl;
/*     */     }
/*  34 */     if (this.a != null) {
/*     */       try {
/*  36 */         File localFile = this.a.a(paramString);
/*  37 */         if ((localFile != null) && (localFile.exists())) {
/*     */           try {
/*  39 */             localayl = (ayl)paramClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { paramString });
/*     */           } catch (Exception localException2) {
/*  41 */             throw new RuntimeException("Failed to instantiate " + paramClass.toString(), localException2);
/*     */           }
/*     */           
/*  44 */           FileInputStream localFileInputStream = new FileInputStream(localFile);
/*  45 */           dh localdh = du.a(localFileInputStream);
/*  46 */           localFileInputStream.close();
/*     */           
/*  48 */           localayl.a(localdh.m("data"));
/*     */         }
/*     */       } catch (Exception localException1) {
/*  51 */         localException1.printStackTrace();
/*     */       }
/*     */     }
/*     */     
/*  55 */     if (localayl != null) {
/*  56 */       this.b.put(paramString, localayl);
/*  57 */       this.c.add(localayl);
/*     */     }
/*  59 */     return localayl;
/*     */   }
/*     */   
/*     */   public void a(String paramString, ayl paramayl) {
/*  63 */     if (paramayl == null) throw new RuntimeException("Can't set null data");
/*  64 */     if (this.b.containsKey(paramString)) {
/*  65 */       this.c.remove(this.b.remove(paramString));
/*     */     }
/*  67 */     this.b.put(paramString, paramayl);
/*  68 */     this.c.add(paramayl);
/*     */   }
/*     */   
/*     */   public void a() {
/*  72 */     for (int i = 0; i < this.c.size(); i++) {
/*  73 */       ayl localayl = (ayl)this.c.get(i);
/*  74 */       if (localayl.d()) {
/*  75 */         a(localayl);
/*  76 */         localayl.a(false);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ayl paramayl) {
/*  82 */     if (this.a == null) return;
/*     */     try {
/*  84 */       File localFile = this.a.a(paramayl.h);
/*  85 */       if (localFile != null) {
/*  86 */         dh localdh1 = new dh();
/*  87 */         paramayl.b(localdh1);
/*     */         
/*  89 */         dh localdh2 = new dh();
/*  90 */         localdh2.a("data", localdh1);
/*     */         
/*  92 */         FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
/*  93 */         du.a(localdh2, localFileOutputStream);
/*  94 */         localFileOutputStream.close();
/*     */       }
/*     */     } catch (Exception localException) {
/*  97 */       localException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/*     */     try {
/* 103 */       this.d.clear();
/* 104 */       if (this.a == null) return;
/* 105 */       File localFile = this.a.a("idcounts");
/* 106 */       if ((localFile != null) && (localFile.exists())) {
/* 107 */         DataInputStream localDataInputStream = new DataInputStream(new FileInputStream(localFile));
/* 108 */         localdh = du.a(localDataInputStream);
/* 109 */         localDataInputStream.close();
/*     */         
/* 111 */         for (String str1 : localdh.c()) {
/* 112 */           dy localdy = localdh.a(str1);
/* 113 */           if ((localdy instanceof dw)) {
/* 114 */             dw localdw = (dw)localdy;
/* 115 */             String str2 = str1;
/* 116 */             short s = localdw.e();
/* 117 */             this.d.put(str2, Short.valueOf(s));
/*     */           }
/*     */         }
/*     */       }
/*     */     } catch (Exception localException) { dh localdh;
/* 122 */       localException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(String paramString) {
/* 127 */     Short localShort = (Short)this.d.get(paramString);
/* 128 */     Object localObject1; Object localObject2; if (localShort == null) {
/* 129 */       localShort = Short.valueOf((short)0);
/*     */     } else {
/* 131 */       localObject1 = localShort;localObject2 = localShort = Short.valueOf((short)(localShort.shortValue() + 1));
/*     */     }
/*     */     
/* 134 */     this.d.put(paramString, localShort);
/* 135 */     if (this.a == null) return localShort.shortValue();
/*     */     try {
/* 137 */       localObject1 = this.a.a("idcounts");
/* 138 */       if (localObject1 != null) {
/* 139 */         localObject2 = new dh();
/*     */         
/* 141 */         for (Object localObject3 = this.d.keySet().iterator(); ((Iterator)localObject3).hasNext();) { String str = (String)((Iterator)localObject3).next();
/* 142 */           short s = ((Short)this.d.get(str)).shortValue();
/* 143 */           ((dh)localObject2).a(str, s);
/*     */         }
/*     */         
/* 146 */         localObject3 = new DataOutputStream(new FileOutputStream((File)localObject1));
/* 147 */         du.a((dh)localObject2, (DataOutput)localObject3);
/* 148 */         ((DataOutputStream)localObject3).close();
/*     */       }
/*     */     } catch (Exception localException) {
/* 151 */       localException.printStackTrace();
/*     */     }
/* 153 */     return localShort.shortValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\azq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */