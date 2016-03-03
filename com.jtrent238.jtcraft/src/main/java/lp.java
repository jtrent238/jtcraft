/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lp
/*     */   extends bac
/*     */ {
/*     */   private final MinecraftServer a;
/*  15 */   private final Set b = new HashSet();
/*     */   private bad c;
/*     */   
/*     */   public lp(MinecraftServer paramMinecraftServer) {
/*  19 */     this.a = paramMinecraftServer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(azz paramazz)
/*     */   {
/*  28 */     super.a(paramazz);
/*     */     
/*  30 */     if (this.b.contains(paramazz.d())) {
/*  31 */       this.a.ah().a(new ie(paramazz, 0));
/*     */     }
/*     */     
/*  34 */     b();
/*     */   }
/*     */   
/*     */   public void a(String paramString)
/*     */   {
/*  39 */     super.a(paramString);
/*  40 */     this.a.ah().a(new ie(paramString));
/*  41 */     b();
/*     */   }
/*     */   
/*     */   public void a(int paramInt, azx paramazx)
/*     */   {
/*  46 */     azx localazx = a(paramInt);
/*     */     
/*  48 */     super.a(paramInt, paramazx);
/*     */     
/*  50 */     if ((localazx != paramazx) && (localazx != null)) {
/*  51 */       if (h(localazx) > 0) {
/*  52 */         this.a.ah().a(new hv(paramInt, paramazx));
/*     */       } else {
/*  54 */         g(localazx);
/*     */       }
/*     */     }
/*     */     
/*  58 */     if (paramazx != null) {
/*  59 */       if (this.b.contains(paramazx)) {
/*  60 */         this.a.ah().a(new hv(paramInt, paramazx));
/*     */       } else {
/*  62 */         e(paramazx);
/*     */       }
/*     */     }
/*     */     
/*  66 */     b();
/*     */   }
/*     */   
/*     */   public boolean a(String paramString1, String paramString2)
/*     */   {
/*  71 */     if (super.a(paramString1, paramString2)) {
/*  72 */       azy localazy = e(paramString2);
/*  73 */       this.a.ah().a(new id(localazy, Arrays.asList(new String[] { paramString1 }), 3));
/*  74 */       b();
/*     */       
/*  76 */       return true;
/*     */     }
/*     */     
/*  79 */     return false;
/*     */   }
/*     */   
/*     */   public void a(String paramString, azy paramazy)
/*     */   {
/*  84 */     super.a(paramString, paramazy);
/*     */     
/*  86 */     this.a.ah().a(new id(paramazy, Arrays.asList(new String[] { paramString }), 4));
/*     */     
/*  88 */     b();
/*     */   }
/*     */   
/*     */   public void a(azx paramazx)
/*     */   {
/*  93 */     super.a(paramazx);
/*  94 */     b();
/*     */   }
/*     */   
/*     */   public void b(azx paramazx)
/*     */   {
/*  99 */     super.b(paramazx);
/*     */     
/* 101 */     if (this.b.contains(paramazx)) {
/* 102 */       this.a.ah().a(new ic(paramazx, 2));
/*     */     }
/*     */     
/* 105 */     b();
/*     */   }
/*     */   
/*     */   public void c(azx paramazx)
/*     */   {
/* 110 */     super.c(paramazx);
/*     */     
/* 112 */     if (this.b.contains(paramazx)) {
/* 113 */       g(paramazx);
/*     */     }
/*     */     
/* 116 */     b();
/*     */   }
/*     */   
/*     */   public void a(azy paramazy)
/*     */   {
/* 121 */     super.a(paramazy);
/*     */     
/* 123 */     this.a.ah().a(new id(paramazy, 0));
/*     */     
/* 125 */     b();
/*     */   }
/*     */   
/*     */   public void b(azy paramazy)
/*     */   {
/* 130 */     super.b(paramazy);
/*     */     
/* 132 */     this.a.ah().a(new id(paramazy, 2));
/*     */     
/* 134 */     b();
/*     */   }
/*     */   
/*     */   public void c(azy paramazy)
/*     */   {
/* 139 */     super.c(paramazy);
/*     */     
/* 141 */     this.a.ah().a(new id(paramazy, 1));
/*     */     
/* 143 */     b();
/*     */   }
/*     */   
/*     */   public void a(bad parambad) {
/* 147 */     this.c = parambad;
/*     */   }
/*     */   
/*     */   protected void b() {
/* 151 */     if (this.c != null) {
/* 152 */       this.c.c();
/*     */     }
/*     */   }
/*     */   
/*     */   public List d(azx paramazx) {
/* 157 */     ArrayList localArrayList = new ArrayList();
/* 158 */     localArrayList.add(new ic(paramazx, 0));
/*     */     
/* 160 */     for (int i = 0; i < 3; i++) {
/* 161 */       if (a(i) == paramazx) { localArrayList.add(new hv(i, paramazx));
/*     */       }
/*     */     }
/* 164 */     for (azz localazz : i(paramazx)) {
/* 165 */       localArrayList.add(new ie(localazz, 0));
/*     */     }
/*     */     
/* 168 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public void e(azx paramazx) {
/* 172 */     List localList = d(paramazx);
/*     */     
/* 174 */     for (Iterator localIterator1 = this.a.ah().e.iterator(); localIterator1.hasNext();) { localmw = (mw)localIterator1.next();
/* 175 */       for (ft localft : localList) {
/* 176 */         localmw.a.a(localft);
/*     */       }
/*     */     }
/*     */     mw localmw;
/* 180 */     this.b.add(paramazx);
/*     */   }
/*     */   
/*     */   public List f(azx paramazx) {
/* 184 */     ArrayList localArrayList = new ArrayList();
/* 185 */     localArrayList.add(new ic(paramazx, 1));
/*     */     
/* 187 */     for (int i = 0; i < 3; i++) {
/* 188 */       if (a(i) == paramazx) { localArrayList.add(new hv(i, paramazx));
/*     */       }
/*     */     }
/* 191 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public void g(azx paramazx) {
/* 195 */     List localList = f(paramazx);
/*     */     
/* 197 */     for (Iterator localIterator1 = this.a.ah().e.iterator(); localIterator1.hasNext();) { localmw = (mw)localIterator1.next();
/* 198 */       for (ft localft : localList) {
/* 199 */         localmw.a.a(localft);
/*     */       }
/*     */     }
/*     */     mw localmw;
/* 203 */     this.b.remove(paramazx);
/*     */   }
/*     */   
/*     */   public int h(azx paramazx) {
/* 207 */     int i = 0;
/*     */     
/* 209 */     for (int j = 0; j < 3; j++) {
/* 210 */       if (a(j) == paramazx) { i++;
/*     */       }
/*     */     }
/* 213 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\lp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */