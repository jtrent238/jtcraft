/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.IllegalFormatException;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fr
/*     */   extends fe
/*     */ {
/*     */   private final String d;
/*     */   private final Object[] e;
/*  17 */   private final Object f = new Object();
/*  18 */   private long g = -1L;
/*     */   
/*  20 */   List b = Lists.newArrayList();
/*     */   
/*     */ 
/*  23 */   public static final Pattern c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
/*     */   
/*     */   public fr(String paramString, Object... paramVarArgs) {
/*  26 */     this.d = paramString;
/*  27 */     this.e = paramVarArgs;
/*     */     
/*  29 */     for (Object localObject : paramVarArgs) {
/*  30 */       if ((localObject instanceof fj)) {
/*  31 */         ((fj)localObject).b().a(b());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   synchronized void g()
/*     */   {
/*  38 */     synchronized (this.f) {
/*  39 */       long l = dd.a();
/*  40 */       if (l == this.g) {
/*  41 */         return;
/*     */       }
/*  43 */       this.g = l;
/*  44 */       this.b.clear();
/*     */     }
/*     */     try
/*     */     {
/*  48 */       b(dd.a(this.d));
/*     */     } catch (fs localfs1) {
/*  50 */       this.b.clear();
/*     */       try {
/*  52 */         b(dd.b(this.d));
/*     */       } catch (fs localfs2) {
/*  54 */         throw localfs1;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(String paramString) {
/*  60 */     int i = 0;
/*  61 */     Matcher localMatcher = c.matcher(paramString);
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*     */     try
/*     */     {
/*  67 */       while (localMatcher.find(k)) {
/*  68 */         int m = localMatcher.start();
/*  69 */         int n = localMatcher.end();
/*     */         
/*     */ 
/*  72 */         if (m > k) {
/*  73 */           localObject1 = new fq(String.format(paramString.substring(k, m), new Object[0]));
/*  74 */           ((fq)localObject1).b().a(b());
/*  75 */           this.b.add(localObject1);
/*     */         }
/*     */         
/*  78 */         Object localObject1 = localMatcher.group(2);
/*  79 */         String str = paramString.substring(m, n);
/*     */         
/*     */         Object localObject2;
/*  82 */         if (("%".equals(localObject1)) && ("%%".equals(str))) {
/*  83 */           localObject2 = new fq("%");
/*  84 */           ((fq)localObject2).b().a(b());
/*  85 */           this.b.add(localObject2);
/*  86 */         } else if ("s".equals(localObject1)) {
/*  87 */           localObject2 = localMatcher.group(1);
/*  88 */           int i1 = localObject2 != null ? Integer.parseInt((String)localObject2) - 1 : j++;
/*  89 */           this.b.add(a(i1));
/*     */         } else {
/*  91 */           throw new fs(this, "Unsupported format: '" + str + "'");
/*     */         }
/*     */         
/*  94 */         k = n;
/*     */       }
/*     */       
/*     */ 
/*  98 */       if (k < paramString.length()) {
/*  99 */         fq localfq = new fq(String.format(paramString.substring(k), new Object[0]));
/* 100 */         localfq.b().a(b());
/* 101 */         this.b.add(localfq);
/*     */       }
/*     */     } catch (IllegalFormatException localIllegalFormatException) {
/* 104 */       throw new fs(this, localIllegalFormatException);
/*     */     }
/*     */   }
/*     */   
/*     */   private fj a(int paramInt) {
/* 109 */     if (paramInt >= this.e.length) {
/* 110 */       throw new fs(this, paramInt);
/*     */     }
/*     */     
/* 113 */     Object localObject1 = this.e[paramInt];
/*     */     
/*     */     Object localObject2;
/* 116 */     if ((localObject1 instanceof fj)) {
/* 117 */       localObject2 = (fj)localObject1;
/*     */     } else {
/* 119 */       localObject2 = new fq(localObject1 == null ? "null" : localObject1.toString());
/* 120 */       ((fj)localObject2).b().a(b());
/*     */     }
/*     */     
/* 123 */     return (fj)localObject2;
/*     */   }
/*     */   
/*     */   public fj a(fn paramfn)
/*     */   {
/* 128 */     super.a(paramfn);
/*     */     
/* 130 */     for (Object localObject2 : this.e) {
/* 131 */       if ((localObject2 instanceof fj)) {
/* 132 */         ((fj)localObject2).b().a(b());
/*     */       }
/*     */     }
/*     */     
/* 136 */     if (this.g > -1L) {
/* 137 */       for (??? = this.b.iterator(); ((Iterator)???).hasNext();) { fj localfj = (fj)((Iterator)???).next();
/* 138 */         localfj.b().a(paramfn);
/*     */       }
/*     */     }
/*     */     
/* 142 */     return this;
/*     */   }
/*     */   
/*     */   public Iterator iterator()
/*     */   {
/* 147 */     g();
/*     */     
/* 149 */     return Iterators.concat(a(this.b), a(this.a));
/*     */   }
/*     */   
/*     */   public String e()
/*     */   {
/* 154 */     g();
/*     */     
/* 156 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/* 158 */     for (fj localfj : this.b) {
/* 159 */       localStringBuilder.append(localfj.e());
/*     */     }
/*     */     
/* 162 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public fr h()
/*     */   {
/* 167 */     Object[] arrayOfObject = new Object[this.e.length];
/*     */     
/* 169 */     for (int i = 0; i < this.e.length; i++) {
/* 170 */       if ((this.e[i] instanceof fj)) {
/* 171 */         arrayOfObject[i] = ((fj)this.e[i]).f();
/*     */       } else {
/* 173 */         arrayOfObject[i] = this.e[i];
/*     */       }
/*     */     }
/*     */     
/* 177 */     fr localfr = new fr(this.d, arrayOfObject);
/* 178 */     localfr.a(b().l());
/* 179 */     for (fj localfj : a()) {
/* 180 */       localfr.a(localfj.f());
/*     */     }
/* 182 */     return localfr;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 187 */     if (this == paramObject) { return true;
/*     */     }
/* 189 */     if ((paramObject instanceof fr)) {
/* 190 */       fr localfr = (fr)paramObject;
/* 191 */       return (Arrays.equals(this.e, localfr.e)) && (this.d.equals(localfr.d)) && (super.equals(paramObject));
/*     */     }
/*     */     
/* 194 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 199 */     int i = super.hashCode();
/* 200 */     i = 31 * i + this.d.hashCode();
/* 201 */     i = 31 * i + Arrays.hashCode(this.e);
/* 202 */     return i;
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 207 */     return "TranslatableComponent{key='" + this.d + '\'' + ", args=" + Arrays.toString(this.e) + ", siblings=" + this.a + ", style=" + b() + '}';
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String i()
/*     */   {
/* 216 */     return this.d;
/*     */   }
/*     */   
/*     */   public Object[] j() {
/* 220 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */