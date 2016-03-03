/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.lwjgl.input.Keyboard;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdq
/*     */   extends bdw
/*     */ {
/*  40 */   private static bny a = new bny();
/*  41 */   private static final List f = new ArrayList();
/*     */   private final bcz g;
/*     */   private String h;
/*     */   private String i;
/*     */   private String r;
/*     */   private bds s;
/*     */   private bcb t;
/*     */   private bcd u;
/*     */   
/*     */   static
/*     */   {
/*  52 */     a("Classic Flat", adb.a(ajn.c), ahu.p, Arrays.asList(new String[] { "village" }), new ast[] { new ast(1, ajn.c), new ast(2, ajn.d), new ast(1, ajn.h) });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */     a("Tunnelers' Dream", adb.a(ajn.b), ahu.r, Arrays.asList(new String[] { "biome_1", "dungeon", "decoration", "stronghold", "mineshaft" }), new ast[] { new ast(1, ajn.c), new ast(5, ajn.d), new ast(230, ajn.b), new ast(1, ajn.h) });
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
/*  70 */     a("Water World", adb.a(ajn.i), ahu.p, Arrays.asList(new String[] { "village", "biome_1" }), new ast[] { new ast(90, ajn.j), new ast(5, ajn.m), new ast(5, ajn.d), new ast(5, ajn.b), new ast(1, ajn.h) });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */     a("Overworld", adb.a(ajn.H), ahu.p, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake" }), new ast[] { new ast(1, ajn.c), new ast(3, ajn.d), new ast(59, ajn.b), new ast(1, ajn.h) });
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
/*  90 */     a("Snowy Kingdom", adb.a(ajn.aC), ahu.A, Arrays.asList(new String[] { "village", "biome_1" }), new ast[] { new ast(1, ajn.aC), new ast(1, ajn.c), new ast(3, ajn.d), new ast(59, ajn.b), new ast(1, ajn.h) });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */     a("Bottomless Pit", ade.G, ahu.p, Arrays.asList(new String[] { "village", "biome_1" }), new ast[] { new ast(1, ajn.c), new ast(3, ajn.d), new ast(2, ajn.e) });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */     a("Desert", adb.a(ajn.m), ahu.q, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon" }), new ast[] { new ast(8, ajn.m), new ast(52, ajn.A), new ast(3, ajn.b), new ast(1, ajn.h) });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */     a("Redstone Ready", ade.ax, ahu.q, new ast[] { new ast(52, ajn.A), new ast(3, ajn.b), new ast(1, ajn.h) });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public bdq(bcz parambcz)
/*     */   {
/* 124 */     this.g = parambcz;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/* 129 */     this.n.clear();
/* 130 */     Keyboard.enableRepeatEvents(true);
/*     */     
/* 132 */     this.h = brp.a("createWorld.customize.presets.title", new Object[0]);
/* 133 */     this.i = brp.a("createWorld.customize.presets.share", new Object[0]);
/* 134 */     this.r = brp.a("createWorld.customize.presets.list", new Object[0]);
/* 135 */     this.u = new bcd(this.q, 50, 40, this.l - 100, 20);
/* 136 */     this.s = new bds(this);
/*     */     
/* 138 */     this.u.f(1230);
/* 139 */     this.u.a(this.g.a());
/*     */     
/* 141 */     this.n.add(this.t = new bcb(0, this.l / 2 - 155, this.m - 28, 150, 20, brp.a("createWorld.customize.presets.select", new Object[0])));
/* 142 */     this.n.add(new bcb(1, this.l / 2 + 5, this.m - 28, 150, 20, brp.a("gui.cancel", new Object[0])));
/*     */     
/* 144 */     a();
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/* 149 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 154 */     this.u.a(paramInt1, paramInt2, paramInt3);
/* 155 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/* 160 */     if (!this.u.a(paramChar, paramInt)) {
/* 161 */       super.a(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 167 */     if ((parambcb.k == 0) && (h())) {
/* 168 */       this.g.a(this.u.b());
/* 169 */       this.k.a(this.g);
/* 170 */     } else if (parambcb.k == 1) {
/* 171 */       this.k.a(this.g);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 177 */     c();
/*     */     
/* 179 */     this.s.a(paramInt1, paramInt2, paramFloat);
/* 180 */     a(this.q, this.h, this.l / 2, 8, 16777215);
/* 181 */     b(this.q, this.i, 50, 30, 10526880);
/* 182 */     b(this.q, this.r, 50, 70, 10526880);
/*     */     
/* 184 */     this.u.f();
/* 185 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 190 */     this.u.a();
/* 191 */     super.e();
/*     */   }
/*     */   
/*     */   public void a() {
/* 195 */     boolean bool = h();
/* 196 */     this.t.l = bool;
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 200 */     return ((this.s.k > -1) && (this.s.k < f.size())) || (this.u.b().length() > 1);
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
/*     */   private static void a(String paramString, adb paramadb, ahu paramahu, ast... paramVarArgs)
/*     */   {
/* 274 */     a(paramString, paramadb, paramahu, null, paramVarArgs);
/*     */   }
/*     */   
/*     */   private static void a(String paramString, adb paramadb, ahu paramahu, List paramList, ast... paramVarArgs) {
/* 278 */     ass localass = new ass();
/*     */     
/* 280 */     for (int j = paramVarArgs.length - 1; j >= 0; j--) {
/* 281 */       localass.c().add(paramVarArgs[j]);
/*     */     }
/*     */     
/* 284 */     localass.a(paramahu.ay);
/* 285 */     localass.d();
/*     */     
/* 287 */     if (paramList != null) {
/* 288 */       for (String str : paramList) {
/* 289 */         localass.b().put(str, new HashMap());
/*     */       }
/*     */     }
/*     */     
/* 293 */     f.add(new bdr(paramadb, paramString, localass.toString()));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */