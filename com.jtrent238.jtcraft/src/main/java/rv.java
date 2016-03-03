/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.UUID;
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
/*     */ public class rv
/*     */ {
/*  23 */   public static final rv[] a = new rv[32];
/*     */   
/*  25 */   public static final rv b = null;
/*  26 */   public static final rv c = new rv(1, false, 8171462).b("potion.moveSpeed").b(0, 0).a(yj.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224D, 2);
/*  27 */   public static final rv d = new rv(2, true, 5926017).b("potion.moveSlowdown").b(1, 0).a(yj.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15000000596046448D, 2);
/*  28 */   public static final rv e = new rv(3, false, 14270531).b("potion.digSpeed").b(2, 0).a(1.5D);
/*  29 */   public static final rv f = new rv(4, true, 4866583).b("potion.digSlowDown").b(3, 0);
/*  30 */   public static final rv g = new rs(5, false, 9643043).b("potion.damageBoost").b(4, 0).a(yj.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3.0D, 2);
/*  31 */   public static final rv h = new ru(6, false, 16262179).b("potion.heal");
/*  32 */   public static final rv i = new ru(7, true, 4393481).b("potion.harm");
/*  33 */   public static final rv j = new rv(8, false, 7889559).b("potion.jump").b(2, 1);
/*  34 */   public static final rv k = new rv(9, true, 5578058).b("potion.confusion").b(3, 1).a(0.25D);
/*  35 */   public static final rv l = new rv(10, false, 13458603).b("potion.regeneration").b(7, 0).a(0.25D);
/*  36 */   public static final rv m = new rv(11, false, 10044730).b("potion.resistance").b(6, 1);
/*  37 */   public static final rv n = new rv(12, false, 14981690).b("potion.fireResistance").b(7, 1);
/*  38 */   public static final rv o = new rv(13, false, 3035801).b("potion.waterBreathing").b(0, 2);
/*  39 */   public static final rv p = new rv(14, false, 8356754).b("potion.invisibility").b(0, 1);
/*  40 */   public static final rv q = new rv(15, true, 2039587).b("potion.blindness").b(5, 1).a(0.25D);
/*  41 */   public static final rv r = new rv(16, false, 2039713).b("potion.nightVision").b(4, 1);
/*  42 */   public static final rv s = new rv(17, true, 5797459).b("potion.hunger").b(1, 1);
/*  43 */   public static final rv t = new rs(18, true, 4738376).b("potion.weakness").b(5, 0).a(yj.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0D, 0);
/*  44 */   public static final rv u = new rv(19, true, 5149489).b("potion.poison").b(6, 0).a(0.25D);
/*  45 */   public static final rv v = new rv(20, true, 3484199).b("potion.wither").b(1, 2).a(0.25D);
/*  46 */   public static final rv w = new rt(21, false, 16284963).b("potion.healthBoost").b(2, 2).a(yj.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0D, 0);
/*  47 */   public static final rv x = new rr(22, false, 2445989).b("potion.absorption").b(2, 2);
/*  48 */   public static final rv y = new ru(23, false, 16262179).b("potion.saturation");
/*  49 */   public static final rv z = null;
/*  50 */   public static final rv A = null;
/*  51 */   public static final rv B = null;
/*  52 */   public static final rv C = null;
/*  53 */   public static final rv D = null;
/*  54 */   public static final rv E = null;
/*  55 */   public static final rv F = null;
/*  56 */   public static final rv G = null;
/*     */   
/*     */   public final int H;
/*  59 */   private final Map I = Maps.newHashMap();
/*     */   private final boolean J;
/*     */   private final int K;
/*  62 */   private String L = "";
/*  63 */   private int M = -1;
/*     */   private double N;
/*     */   private boolean O;
/*     */   
/*     */   protected rv(int paramInt1, boolean paramBoolean, int paramInt2) {
/*  68 */     this.H = paramInt1;
/*     */     
/*  70 */     a[paramInt1] = this;
/*  71 */     this.J = paramBoolean;
/*  72 */     if (paramBoolean) {
/*  73 */       this.N = 0.5D;
/*     */     } else {
/*  75 */       this.N = 1.0D;
/*     */     }
/*  77 */     this.K = paramInt2;
/*     */   }
/*     */   
/*     */   protected rv b(int paramInt1, int paramInt2) {
/*  81 */     this.M = (paramInt1 + paramInt2 * 8);
/*  82 */     return this;
/*     */   }
/*     */   
/*     */   public int c() {
/*  86 */     return this.H;
/*     */   }
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
/*     */   public void a(sv paramsv, int paramInt)
/*     */   {
/* 100 */     if (this.H == l.H) {
/* 101 */       if (paramsv.aS() < paramsv.aY()) {
/* 102 */         paramsv.f(1.0F);
/*     */       }
/* 104 */     } else if (this.H == u.H) {
/* 105 */       if (paramsv.aS() > 1.0F) {
/* 106 */         paramsv.a(ro.k, 1.0F);
/*     */       }
/* 108 */     } else if (this.H == v.H) {
/* 109 */       paramsv.a(ro.l, 1.0F);
/* 110 */     } else if ((this.H == s.H) && ((paramsv instanceof yz)))
/*     */     {
/*     */ 
/* 113 */       ((yz)paramsv).a(0.025F * (paramInt + 1));
/* 114 */     } else if ((this.H == y.H) && ((paramsv instanceof yz))) {
/* 115 */       if (!paramsv.o.E) {
/* 116 */         ((yz)paramsv).bQ().a(paramInt + 1, 1.0F);
/*     */       }
/* 118 */     } else if (((this.H == h.H) && (!paramsv.aR())) || ((this.H == i.H) && (paramsv.aR()))) {
/* 119 */       paramsv.f(Math.max(4 << paramInt, 0));
/* 120 */     } else if (((this.H == i.H) && (!paramsv.aR())) || ((this.H == h.H) && (paramsv.aR())))
/* 121 */       paramsv.a(ro.k, 6 << paramInt);
/*     */   }
/*     */   
/*     */   public void a(sv paramsv1, sv paramsv2, int paramInt, double paramDouble) {
/*     */     int i1;
/* 126 */     if (((this.H == h.H) && (!paramsv2.aR())) || ((this.H == i.H) && (paramsv2.aR()))) {
/* 127 */       i1 = (int)(paramDouble * (4 << paramInt) + 0.5D);
/* 128 */       paramsv2.f(i1);
/* 129 */     } else if (((this.H == i.H) && (!paramsv2.aR())) || ((this.H == h.H) && (paramsv2.aR()))) {
/* 130 */       i1 = (int)(paramDouble * (6 << paramInt) + 0.5D);
/* 131 */       if (paramsv1 == null) {
/* 132 */         paramsv2.a(ro.k, i1);
/*     */       } else {
/* 134 */         paramsv2.a(ro.b(paramsv2, paramsv1), i1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 140 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/*     */     int i1;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */     if (this.H == l.H)
/*     */     {
/* 158 */       i1 = 50 >> paramInt2;
/* 159 */       if (i1 > 0) {
/* 160 */         return paramInt1 % i1 == 0;
/*     */       }
/* 162 */       return true; }
/* 163 */     if (this.H == u.H)
/*     */     {
/* 165 */       i1 = 25 >> paramInt2;
/* 166 */       if (i1 > 0) {
/* 167 */         return paramInt1 % i1 == 0;
/*     */       }
/* 169 */       return true; }
/* 170 */     if (this.H == v.H) {
/* 171 */       i1 = 40 >> paramInt2;
/* 172 */       if (i1 > 0) {
/* 173 */         return paramInt1 % i1 == 0;
/*     */       }
/* 175 */       return true; }
/* 176 */     if (this.H == s.H) {
/* 177 */       return true;
/*     */     }
/*     */     
/* 180 */     return false;
/*     */   }
/*     */   
/*     */   public rv b(String paramString)
/*     */   {
/* 185 */     this.L = paramString;
/* 186 */     return this;
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/* 191 */     return this.L;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 195 */     return this.M >= 0;
/*     */   }
/*     */   
/*     */   public int e() {
/* 199 */     return this.M;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 203 */     return this.J;
/*     */   }
/*     */   
/*     */   public static String a(rw paramrw) {
/* 207 */     if (paramrw.g()) {
/* 208 */       return "**:**";
/*     */     }
/* 210 */     int i1 = paramrw.b();
/* 211 */     return qn.a(i1);
/*     */   }
/*     */   
/*     */   protected rv a(double paramDouble) {
/* 215 */     this.N = paramDouble;
/* 216 */     return this;
/*     */   }
/*     */   
/*     */   public double g() {
/* 220 */     return this.N;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean i()
/*     */   {
/* 229 */     return this.O;
/*     */   }
/*     */   
/*     */   public int j() {
/* 233 */     return this.K;
/*     */   }
/*     */   
/*     */   public rv a(th paramth, String paramString, double paramDouble, int paramInt) {
/* 237 */     tj localtj = new tj(UUID.fromString(paramString), a(), paramDouble, paramInt);
/* 238 */     this.I.put(paramth, localtj);
/* 239 */     return this;
/*     */   }
/*     */   
/*     */   public Map k() {
/* 243 */     return this.I;
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, tl paramtl, int paramInt) {
/* 247 */     for (Map.Entry localEntry : this.I.entrySet()) {
/* 248 */       ti localti = paramtl.a((th)localEntry.getKey());
/*     */       
/* 250 */       if (localti != null) {
/* 251 */         localti.b((tj)localEntry.getValue());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(sv paramsv, tl paramtl, int paramInt) {
/* 257 */     for (Map.Entry localEntry : this.I.entrySet()) {
/* 258 */       ti localti = paramtl.a((th)localEntry.getKey());
/*     */       
/* 260 */       if (localti != null) {
/* 261 */         tj localtj = (tj)localEntry.getValue();
/* 262 */         localti.b(localtj);
/* 263 */         localti.a(new tj(localtj.a(), a() + " " + paramInt, a(paramInt, localtj), localtj.c()));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public double a(int paramInt, tj paramtj) {
/* 269 */     return paramtj.d() * (paramInt + 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */