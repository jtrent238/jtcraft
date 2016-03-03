/*     */ import java.text.DecimalFormat;
/*     */ import java.text.NumberFormat;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ph
/*     */ {
/*     */   public final String e;
/*     */   private final fj a;
/*     */   public boolean f;
/*     */   private final pm b;
/*     */   private final bah c;
/*     */   private Class d;
/*     */   
/*     */   public ph(String paramString, fj paramfj, pm parampm)
/*     */   {
/*  23 */     this.e = paramString;
/*  24 */     this.a = paramfj;
/*  25 */     this.b = parampm;
/*  26 */     this.c = new bai(this);
/*     */     
/*  28 */     bah.a.put(this.c.a(), this.c);
/*     */   }
/*     */   
/*     */   public ph(String paramString, fj paramfj) {
/*  32 */     this(paramString, paramfj, g);
/*     */   }
/*     */   
/*     */   public ph i() {
/*  36 */     this.f = true;
/*  37 */     return this;
/*     */   }
/*     */   
/*     */   public ph h() {
/*  41 */     if (pp.a.containsKey(this.e)) {
/*  42 */       throw new RuntimeException("Duplicate stat id: \"" + ((ph)pp.a.get(this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
/*     */     }
/*  44 */     pp.b.add(this);
/*  45 */     pp.a.put(this.e, this);
/*     */     
/*  47 */     return this;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  51 */     return false;
/*     */   }
/*     */   
/*     */   public String a(int paramInt) {
/*  55 */     return this.b.a(paramInt);
/*     */   }
/*     */   
/*  58 */   private static NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
/*  59 */   public static pm g = new pi();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */   private static DecimalFormat l = new DecimalFormat("########0.00");
/*  67 */   public static pm h = new pj();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */   public static pm i = new pk();
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
/*     */ 
/* 106 */   public static pm j = new pl();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public fj e()
/*     */   {
/* 114 */     fj localfj = this.a.f();
/* 115 */     localfj.b().a(a.h);
/* 116 */     localfj.b().a(new fl(fm.b, new fq(this.e)));
/* 117 */     return localfj;
/*     */   }
/*     */   
/*     */   public fj j() {
/* 121 */     fj localfj1 = e();
/* 122 */     fj localfj2 = new fq("[").a(localfj1).a("]");
/* 123 */     localfj2.a(localfj1.b());
/* 124 */     return localfj2;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 129 */     if (this == paramObject) return true;
/* 130 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) { return false;
/*     */     }
/* 132 */     ph localph = (ph)paramObject;
/*     */     
/* 134 */     return this.e.equals(localph.e);
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 139 */     return this.e.hashCode();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 144 */     return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bah k()
/*     */   {
/* 154 */     return this.c;
/*     */   }
/*     */   
/*     */   public Class l() {
/* 158 */     return this.d;
/*     */   }
/*     */   
/*     */   public ph b(Class paramClass) {
/* 162 */     this.d = paramClass;
/* 163 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */