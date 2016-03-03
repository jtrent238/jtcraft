/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aor
/*     */ {
/*  16 */   private static final Logger a = ;
/*  17 */   private static Map i = new HashMap();
/*  18 */   private static Map j = new HashMap();
/*     */   protected ahb b;
/*     */   
/*  21 */   private static void a(Class paramClass, String paramString) { if (i.containsKey(paramString)) throw new IllegalArgumentException("Duplicate id: " + paramString);
/*  22 */     i.put(paramString, paramClass);
/*  23 */     j.put(paramClass, paramString);
/*     */   }
/*     */   
/*     */   static {
/*  27 */     a(apg.class, "Furnace");
/*  28 */     a(aow.class, "Chest");
/*  29 */     a(ape.class, "EnderChest");
/*  30 */     a(alr.class, "RecordPlayer");
/*  31 */     a(apb.class, "Trap");
/*  32 */     a(apc.class, "Dropper");
/*  33 */     a(apm.class, "Sign");
/*  34 */     a(apj.class, "MobSpawner");
/*  35 */     a(apl.class, "Music");
/*  36 */     a(aps.class, "Piston");
/*  37 */     a(aov.class, "Cauldron");
/*  38 */     a(apd.class, "EnchantTable");
/*  39 */     a(apo.class, "Airportal");
/*  40 */     a(aox.class, "Control");
/*  41 */     a(aoq.class, "Beacon");
/*  42 */     a(apn.class, "Skull");
/*  43 */     a(apa.class, "DLDetector");
/*  44 */     a(api.class, "Hopper");
/*  45 */     a(aoz.class, "Comparator");
/*  46 */     a(apf.class, "FlowerPot");
/*     */   }
/*     */   
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   protected boolean f;
/*  53 */   public int g = -1;
/*     */   public aji h;
/*     */   
/*     */   public ahb w() {
/*  57 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb) {
/*  61 */     this.b = paramahb;
/*     */   }
/*     */   
/*     */   public boolean o() {
/*  65 */     return this.b != null;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh) {
/*  69 */     this.c = paramdh.f("x");
/*  70 */     this.d = paramdh.f("y");
/*  71 */     this.e = paramdh.f("z");
/*     */   }
/*     */   
/*     */   public void b(dh paramdh) {
/*  75 */     String str = (String)j.get(getClass());
/*  76 */     if (str == null) {
/*  77 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*     */     }
/*  79 */     paramdh.a("id", str);
/*  80 */     paramdh.a("x", this.c);
/*  81 */     paramdh.a("y", this.d);
/*  82 */     paramdh.a("z", this.e);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static aor c(dh paramdh)
/*     */   {
/*  89 */     aor localaor = null;
/*     */     try {
/*  91 */       Class localClass = (Class)i.get(paramdh.j("id"));
/*  92 */       if (localClass != null) localaor = (aor)localClass.newInstance();
/*     */     } catch (Exception localException) {
/*  94 */       localException.printStackTrace();
/*     */     }
/*  96 */     if (localaor != null) {
/*  97 */       localaor.a(paramdh);
/*     */     } else {
/*  99 */       a.warn("Skipping BlockEntity with id " + paramdh.j("id"));
/*     */     }
/* 101 */     return localaor;
/*     */   }
/*     */   
/*     */   public int p() {
/* 105 */     if (this.g == -1) this.g = this.b.e(this.c, this.d, this.e);
/* 106 */     return this.g;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void e()
/*     */   {
/* 115 */     if (this.b != null) {
/* 116 */       this.g = this.b.e(this.c, this.d, this.e);
/* 117 */       this.b.b(this.c, this.d, this.e, this);
/*     */       
/* 119 */       if (q() != ajn.a) {
/* 120 */         this.b.f(this.c, this.d, this.e, q());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public double a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 126 */     double d1 = this.c + 0.5D - paramDouble1;
/* 127 */     double d2 = this.d + 0.5D - paramDouble2;
/* 128 */     double d3 = this.e + 0.5D - paramDouble3;
/* 129 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double n() {
/* 133 */     return 4096.0D;
/*     */   }
/*     */   
/*     */   public aji q()
/*     */   {
/* 138 */     if (this.h == null) {
/* 139 */       this.h = this.b.a(this.c, this.d, this.e);
/*     */     }
/* 141 */     return this.h;
/*     */   }
/*     */   
/*     */   public ft m() {
/* 145 */     return null;
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 149 */     return this.f;
/*     */   }
/*     */   
/*     */   public void s() {
/* 153 */     this.f = true;
/*     */   }
/*     */   
/*     */   public void t() {
/* 157 */     this.f = false;
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2) {
/* 161 */     return false;
/*     */   }
/*     */   
/*     */   public void u() {
/* 165 */     this.h = null;
/* 166 */     this.g = -1;
/*     */   }
/*     */   
/*     */   public void a(k paramk) {
/* 170 */     paramk.a("Name", new aos(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */     k.a(paramk, this.c, this.d, this.e, q(), p());
/*     */     
/* 179 */     paramk.a("Actual block type", new aot(this));
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
/* 191 */     paramk.a("Actual block data value", new aou(this));
/*     */   }
/*     */   
/*     */   public void h() {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */