/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.File;
/*     */ import java.io.FileFilter;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class brc
/*     */ {
/*  29 */   protected static final FileFilter a = new brd();
/*     */   
/*     */ 
/*     */   private final File d;
/*     */   
/*     */ 
/*     */   public final bra b;
/*     */   
/*     */ 
/*     */   private final File e;
/*     */   
/*     */ 
/*     */   public final brw c;
/*     */   
/*     */ 
/*     */   private bra f;
/*     */   
/*     */ 
/*     */   private boolean g;
/*     */   
/*  49 */   private List h = Lists.newArrayList();
/*  50 */   private List i = Lists.newArrayList();
/*     */   
/*     */   public brc(File paramFile1, File paramFile2, bra parambra, brw parambrw, bbj parambbj) {
/*  53 */     this.d = paramFile1;
/*  54 */     this.e = paramFile2;
/*  55 */     this.b = parambra;
/*  56 */     this.c = parambrw;
/*     */     
/*  58 */     g();
/*     */     
/*  60 */     a();
/*     */     
/*  62 */     for (Iterator localIterator1 = parambbj.l.iterator(); localIterator1.hasNext();) { str = (String)localIterator1.next();
/*  63 */       for (brf localbrf : this.h)
/*  64 */         if (localbrf.d().equals(str)) {
/*  65 */           this.i.add(localbrf);
/*  66 */           break;
/*     */         }
/*     */     }
/*     */     String str;
/*     */   }
/*     */   
/*     */   private void g() {
/*  73 */     if (!this.d.isDirectory()) {
/*  74 */       this.d.delete();
/*  75 */       this.d.mkdirs();
/*     */     }
/*     */   }
/*     */   
/*     */   private List h() {
/*  80 */     if (this.d.isDirectory()) {
/*  81 */       return Arrays.asList(this.d.listFiles(a));
/*     */     }
/*     */     
/*  84 */     return Collections.emptyList();
/*     */   }
/*     */   
/*     */   public void a() {
/*  88 */     ArrayList localArrayList = Lists.newArrayList();
/*     */     
/*  90 */     for (Iterator localIterator = h().iterator(); localIterator.hasNext();) { localObject = (File)localIterator.next();
/*  91 */       brf localbrf = new brf(this, (File)localObject, null);
/*     */       
/*  93 */       if (!this.h.contains(localbrf)) {
/*     */         try {
/*  95 */           localbrf.a();
/*  96 */           localArrayList.add(localbrf);
/*     */         }
/*     */         catch (Exception localException) {
/*  99 */           localArrayList.remove(localbrf);
/*     */         }
/*     */       } else {
/* 102 */         int j = this.h.indexOf(localbrf);
/* 103 */         if ((j > -1) && (j < this.h.size())) {
/* 104 */           localArrayList.add(this.h.get(j));
/*     */         }
/*     */       }
/*     */     }
/*     */     Object localObject;
/* 109 */     this.h.removeAll(localArrayList);
/* 110 */     for (localIterator = this.h.iterator(); localIterator.hasNext();) { localObject = (brf)localIterator.next();
/* 111 */       ((brf)localObject).b();
/*     */     }
/*     */     
/* 114 */     this.h = localArrayList;
/*     */   }
/*     */   
/*     */   public List b() {
/* 118 */     return ImmutableList.copyOf(this.h);
/*     */   }
/*     */   
/*     */   public List c() {
/* 122 */     return ImmutableList.copyOf(this.i);
/*     */   }
/*     */   
/*     */   public void a(List paramList) {
/* 126 */     this.i.clear();
/* 127 */     this.i.addAll(paramList);
/*     */   }
/*     */   
/*     */   public File d() {
/* 131 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 135 */     String str = paramString.substring(paramString.lastIndexOf("/") + 1);
/* 136 */     if (str.contains("?")) str = str.substring(0, str.indexOf("?"));
/* 137 */     if (!str.endsWith(".zip")) return;
/* 138 */     File localFile = new File(this.e, str.replaceAll("\\W", ""));
/* 139 */     f();
/* 140 */     a(paramString, localFile);
/*     */   }
/*     */   
/*     */   private void a(String paramString, File paramFile) {
/* 144 */     HashMap localHashMap = Maps.newHashMap();
/* 145 */     bdt localbdt = new bdt();
/* 146 */     localHashMap.put("X-Minecraft-Username", bao.B().M().c());
/* 147 */     localHashMap.put("X-Minecraft-UUID", bao.B().M().b());
/* 148 */     localHashMap.put("X-Minecraft-Version", "1.7.10");
/* 149 */     this.g = true;
/*     */     
/* 151 */     bao.B().a(localbdt);
/*     */     
/* 153 */     pv.a(paramFile, paramString, new bre(this), localHashMap, 52428800, localbdt, bao.B().O());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bra e()
/*     */   {
/* 165 */     return this.f;
/*     */   }
/*     */   
/*     */   public void f() {
/* 169 */     this.f = null;
/* 170 */     this.g = false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */