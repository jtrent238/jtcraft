/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class aft
/*     */ {
/*  14 */   public static final aft[] b = new aft['Ā'];
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final aft[] c;
/*     */   
/*     */ 
/*     */ 
/*  23 */   public static final aft d = new agi(0, 10, 0);
/*  24 */   public static final aft e = new agi(1, 5, 1);
/*  25 */   public static final aft f = new agi(2, 5, 2);
/*  26 */   public static final aft g = new agi(3, 2, 3);
/*  27 */   public static final aft h = new agi(4, 5, 4);
/*  28 */   public static final aft i = new agh(5, 2);
/*  29 */   public static final aft j = new agl(6, 2);
/*  30 */   public static final aft k = new agj(7, 1);
/*     */   
/*     */ 
/*  33 */   public static final aft l = new afq(16, 10, 0);
/*  34 */   public static final aft m = new afq(17, 5, 1);
/*  35 */   public static final aft n = new afq(18, 5, 2);
/*  36 */   public static final aft o = new agf(19, 5);
/*  37 */   public static final aft p = new agd(20, 2);
/*  38 */   public static final aft q = new agg(21, 2, afu.g);
/*     */   
/*     */ 
/*  41 */   public static final aft r = new afs(32, 10);
/*  42 */   public static final aft s = new agk(33, 1);
/*  43 */   public static final aft t = new afr(34, 5);
/*  44 */   public static final aft u = new agg(35, 2, afu.h);
/*     */   
/*     */ 
/*  47 */   public static final aft v = new afm(48, 10);
/*  48 */   public static final aft w = new afp(49, 2);
/*  49 */   public static final aft x = new afn(50, 2);
/*  50 */   public static final aft y = new afo(51, 1);
/*     */   
/*     */ 
/*  53 */   public static final aft z = new agg(61, 2, afu.i);
/*  54 */   public static final aft A = new age(62, 2, afu.i);
/*     */   
/*     */   public final int B;
/*     */   private final int a;
/*     */   public afu C;
/*     */   protected String D;
/*     */   
/*     */   static
/*     */   {
/*  63 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  65 */     for (aft localaft : b) {
/*  66 */       if (localaft != null) {
/*  67 */         localArrayList.add(localaft);
/*     */       }
/*     */     }
/*     */     
/*  71 */     c = (aft[])localArrayList.toArray(new aft[0]);
/*     */   }
/*     */   
/*     */   protected aft(int paramInt1, int paramInt2, afu paramafu) {
/*  75 */     this.B = paramInt1;
/*  76 */     this.a = paramInt2;
/*  77 */     this.C = paramafu;
/*     */     
/*  79 */     if (b[paramInt1] != null) throw new IllegalArgumentException("Duplicate enchantment id!");
/*  80 */     b[paramInt1] = this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int c()
/*     */   {
/*  88 */     return this.a;
/*     */   }
/*     */   
/*     */   public int d() {
/*  92 */     return 1;
/*     */   }
/*     */   
/*     */   public int b() {
/*  96 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/* 100 */     return 1 + paramInt * 10;
/*     */   }
/*     */   
/*     */   public int b(int paramInt) {
/* 104 */     return a(paramInt) + 5;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, ro paramro) {
/* 108 */     return 0;
/*     */   }
/*     */   
/*     */   public float a(int paramInt, sz paramsz) {
/* 112 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public boolean a(aft paramaft) {
/* 116 */     return this != paramaft;
/*     */   }
/*     */   
/*     */   public aft b(String paramString)
/*     */   {
/* 121 */     this.D = paramString;
/* 122 */     return this;
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/* 127 */     return "enchantment." + this.D;
/*     */   }
/*     */   
/*     */   public String c(int paramInt) {
/* 131 */     String str = dd.a(a());
/* 132 */     return str + " " + dd.a(new StringBuilder().append("enchantment.level.").append(paramInt).toString());
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd) {
/* 136 */     return this.C.a(paramadd.b());
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, sa paramsa, int paramInt) {}
/*     */   
/*     */   public void b(sv paramsv, sa paramsa, int paramInt) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */