/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class qi
/*     */ {
/*   9 */   private static final org.apache.logging.log4j.Logger b = ;
/*  10 */   public qi() { this.c = new ArrayList();
/*  11 */     this.d = new ArrayList();
/*     */     
/*  13 */     this.e = "";
/*  14 */     this.f = new java.util.HashMap();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private final List c;
/*     */   
/*     */ 
/*     */ 
/*     */   private final List d;
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean a;
/*     */   
/*     */ 
/*     */ 
/*     */   private String e;
/*     */   
/*     */ 
/*     */   private final Map f;
/*     */   
/*     */ 
/*     */   public void a()
/*     */   {
/*  40 */     this.f.clear();
/*  41 */     this.e = "";
/*  42 */     this.c.clear();
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  46 */     if (!this.a) return;
/*  47 */     if (this.e.length() > 0) this.e += ".";
/*  48 */     this.e += paramString;
/*  49 */     this.c.add(this.e);
/*  50 */     this.d.add(Long.valueOf(System.nanoTime()));
/*     */   }
/*     */   
/*     */   public void b() {
/*  54 */     if (!this.a) return;
/*  55 */     long l1 = System.nanoTime();
/*  56 */     long l2 = ((Long)this.d.remove(this.d.size() - 1)).longValue();
/*  57 */     this.c.remove(this.c.size() - 1);
/*  58 */     long l3 = l1 - l2;
/*     */     
/*  60 */     if (this.f.containsKey(this.e)) {
/*  61 */       this.f.put(this.e, Long.valueOf(((Long)this.f.get(this.e)).longValue() + l3));
/*     */     } else {
/*  63 */       this.f.put(this.e, Long.valueOf(l3));
/*     */     }
/*     */     
/*  66 */     if (l3 > 100000000L) {
/*  67 */       b.warn("Something's taking too long! '" + this.e + "' took aprox " + l3 / 1000000.0D + " ms");
/*     */     }
/*     */     
/*  70 */     this.e = (!this.c.isEmpty() ? (String)this.c.get(this.c.size() - 1) : "");
/*     */   }
/*     */   
/*     */   public List b(String paramString) {
/*  74 */     if (!this.a) { return null;
/*     */     }
/*  76 */     String str1 = paramString;
/*  77 */     long l1 = this.f.containsKey("root") ? ((Long)this.f.get("root")).longValue() : 0L;
/*  78 */     long l2 = this.f.containsKey(paramString) ? ((Long)this.f.get(paramString)).longValue() : -1L;
/*     */     
/*  80 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  82 */     if (paramString.length() > 0) paramString = paramString + ".";
/*  83 */     long l3 = 0L;
/*     */     
/*  85 */     for (Iterator localIterator = this.f.keySet().iterator(); localIterator.hasNext();) { localObject = (String)localIterator.next();
/*  86 */       if ((((String)localObject).length() > paramString.length()) && (((String)localObject).startsWith(paramString)) && (((String)localObject).indexOf(".", paramString.length() + 1) < 0)) {
/*  87 */         l3 += ((Long)this.f.get(localObject)).longValue();
/*     */       }
/*     */     }
/*     */     
/*  91 */     float f1 = (float)l3;
/*  92 */     if (l3 < l2) l3 = l2;
/*  93 */     if (l1 < l3) { l1 = l3;
/*     */     }
/*  95 */     for (Object localObject = this.f.keySet().iterator(); ((Iterator)localObject).hasNext();) { str2 = (String)((Iterator)localObject).next();
/*  96 */       if ((str2.length() > paramString.length()) && (str2.startsWith(paramString)) && (str2.indexOf(".", paramString.length() + 1) < 0)) {
/*  97 */         long l4 = ((Long)this.f.get(str2)).longValue();
/*  98 */         double d1 = l4 * 100.0D / l3;
/*  99 */         double d2 = l4 * 100.0D / l1;
/* 100 */         String str3 = str2.substring(paramString.length());
/* 101 */         localArrayList.add(new qj(str3, d1, d2));
/*     */       }
/*     */     }
/*     */     String str2;
/* 105 */     for (localObject = this.f.keySet().iterator(); ((Iterator)localObject).hasNext();) { str2 = (String)((Iterator)localObject).next();
/* 106 */       this.f.put(str2, Long.valueOf(((Long)this.f.get(str2)).longValue() * 999L / 1000L));
/*     */     }
/*     */     
/* 109 */     if ((float)l3 > f1) {
/* 110 */       localArrayList.add(new qj("unspecified", ((float)l3 - f1) * 100.0D / l3, ((float)l3 - f1) * 100.0D / l1));
/*     */     }
/* 112 */     java.util.Collections.sort(localArrayList);
/* 113 */     localArrayList.add(0, new qj(str1, 100.0D, l3 * 100.0D / l1));
/* 114 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public void c(String paramString) {
/* 118 */     b();
/* 119 */     a(paramString);
/*     */   }
/*     */   
/*     */   public String c() {
/* 123 */     return this.c.size() == 0 ? "[UNKNOWN]" : (String)this.c.get(this.c.size() - 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */