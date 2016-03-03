/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class fe
/*     */   implements fj
/*     */ {
/*  12 */   protected List a = Lists.newArrayList();
/*     */   private fn b;
/*     */   
/*     */   public fj a(fj paramfj)
/*     */   {
/*  17 */     paramfj.b().a(b());
/*  18 */     this.a.add(paramfj);
/*  19 */     return this;
/*     */   }
/*     */   
/*     */   public List a()
/*     */   {
/*  24 */     return this.a;
/*     */   }
/*     */   
/*     */   public fj a(String paramString)
/*     */   {
/*  29 */     return a(new fq(paramString));
/*     */   }
/*     */   
/*     */   public fj a(fn paramfn)
/*     */   {
/*  34 */     this.b = paramfn;
/*     */     
/*  36 */     for (fj localfj : this.a) {
/*  37 */       localfj.b().a(b());
/*     */     }
/*     */     
/*  40 */     return this;
/*     */   }
/*     */   
/*     */   public fn b()
/*     */   {
/*  45 */     if (this.b == null) {
/*  46 */       this.b = new fn();
/*  47 */       for (fj localfj : this.a) {
/*  48 */         localfj.b().a(this.b);
/*     */       }
/*     */     }
/*  51 */     return this.b;
/*     */   }
/*     */   
/*     */   public Iterator iterator()
/*     */   {
/*  56 */     return Iterators.concat(Iterators.forArray(new fe[] { this }), a(this.a));
/*     */   }
/*     */   
/*     */   public final String c()
/*     */   {
/*  61 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/*  63 */     for (fj localfj : this) {
/*  64 */       localStringBuilder.append(localfj.e());
/*     */     }
/*     */     
/*  67 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public final String d()
/*     */   {
/*  72 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/*  74 */     for (fj localfj : this) {
/*  75 */       localStringBuilder.append(localfj.b().j());
/*  76 */       localStringBuilder.append(localfj.e());
/*  77 */       localStringBuilder.append(a.v);
/*     */     }
/*     */     
/*  80 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public static Iterator a(Iterable paramIterable) {
/*  84 */     Iterator localIterator = Iterators.concat(Iterators.transform(paramIterable.iterator(), new ff()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */     localIterator = Iterators.transform(localIterator, new fg());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */     return localIterator;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 103 */     if (this == paramObject) { return true;
/*     */     }
/* 105 */     if ((paramObject instanceof fe)) {
/* 106 */       fe localfe = (fe)paramObject;
/* 107 */       return (this.a.equals(localfe.a)) && (b().equals(localfe.b()));
/*     */     }
/*     */     
/* 110 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 115 */     return 31 * this.b.hashCode() + this.a.hashCode();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 120 */     return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */