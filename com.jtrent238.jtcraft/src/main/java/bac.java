/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bac
/*     */ {
/*  15 */   private final Map a = new HashMap();
/*  16 */   private final Map b = new HashMap();
/*  17 */   private final Map c = new HashMap();
/*  18 */   private final azx[] d = new azx[3];
/*  19 */   private final Map e = new HashMap();
/*  20 */   private final Map f = new HashMap();
/*     */   
/*     */   public azx b(String paramString) {
/*  23 */     return (azx)this.a.get(paramString);
/*     */   }
/*     */   
/*     */   public azx a(String paramString, bah parambah) {
/*  27 */     azx localazx = b(paramString);
/*  28 */     if (localazx != null) { throw new IllegalArgumentException("An objective with the name '" + paramString + "' already exists!");
/*     */     }
/*  30 */     localazx = new azx(this, paramString, parambah);
/*     */     
/*  32 */     Object localObject = (List)this.b.get(parambah);
/*     */     
/*  34 */     if (localObject == null) {
/*  35 */       localObject = new ArrayList();
/*  36 */       this.b.put(parambah, localObject);
/*     */     }
/*     */     
/*  39 */     ((List)localObject).add(localazx);
/*  40 */     this.a.put(paramString, localazx);
/*  41 */     a(localazx);
/*     */     
/*  43 */     return localazx;
/*     */   }
/*     */   
/*     */   public Collection a(bah parambah) {
/*  47 */     Collection localCollection = (Collection)this.b.get(parambah);
/*     */     
/*  49 */     return localCollection == null ? new ArrayList() : new ArrayList(localCollection);
/*     */   }
/*     */   
/*     */   public azz a(String paramString, azx paramazx) {
/*  53 */     Object localObject = (Map)this.c.get(paramString);
/*     */     
/*  55 */     if (localObject == null) {
/*  56 */       localObject = new HashMap();
/*  57 */       this.c.put(paramString, localObject);
/*     */     }
/*     */     
/*  60 */     azz localazz = (azz)((Map)localObject).get(paramazx);
/*     */     
/*  62 */     if (localazz == null) {
/*  63 */       localazz = new azz(this, paramazx, paramString);
/*  64 */       ((Map)localObject).put(paramazx, localazz);
/*     */     }
/*     */     
/*  67 */     return localazz;
/*     */   }
/*     */   
/*     */   public Collection i(azx paramazx) {
/*  71 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  73 */     for (Map localMap : this.c.values()) {
/*  74 */       azz localazz = (azz)localMap.get(paramazx);
/*  75 */       if (localazz != null) { localArrayList.add(localazz);
/*     */       }
/*     */     }
/*  78 */     Collections.sort(localArrayList, azz.a);
/*     */     
/*  80 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public Collection c() {
/*  84 */     return this.a.values();
/*     */   }
/*     */   
/*     */   public Collection d() {
/*  88 */     return this.c.keySet();
/*     */   }
/*     */   
/*     */   public void c(String paramString) {
/*  92 */     Map localMap = (Map)this.c.remove(paramString);
/*     */     
/*  94 */     if (localMap != null) {
/*  95 */       a(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   public Collection e() {
/* 100 */     Collection localCollection = this.c.values();
/* 101 */     ArrayList localArrayList = new ArrayList();
/*     */     
/* 103 */     for (Map localMap : localCollection) {
/* 104 */       localArrayList.addAll(localMap.values());
/*     */     }
/*     */     
/* 107 */     return localArrayList;
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
/*     */   public Map d(String paramString)
/*     */   {
/* 123 */     Object localObject = (Map)this.c.get(paramString);
/* 124 */     if (localObject == null) localObject = new HashMap();
/* 125 */     return (Map)localObject;
/*     */   }
/*     */   
/*     */   public void k(azx paramazx) {
/* 129 */     this.a.remove(paramazx.b());
/*     */     
/* 131 */     for (int i = 0; i < 3; i++) {
/* 132 */       if (a(i) == paramazx) { a(i, null);
/*     */       }
/*     */     }
/* 135 */     List localList = (List)this.b.get(paramazx.c());
/* 136 */     if (localList != null) { localList.remove(paramazx);
/*     */     }
/* 138 */     for (Map localMap : this.c.values()) {
/* 139 */       localMap.remove(paramazx);
/*     */     }
/*     */     
/* 142 */     c(paramazx);
/*     */   }
/*     */   
/*     */   public void a(int paramInt, azx paramazx) {
/* 146 */     this.d[paramInt] = paramazx;
/*     */   }
/*     */   
/*     */   public azx a(int paramInt) {
/* 150 */     return this.d[paramInt];
/*     */   }
/*     */   
/*     */   public azy e(String paramString) {
/* 154 */     return (azy)this.e.get(paramString);
/*     */   }
/*     */   
/*     */   public azy f(String paramString) {
/* 158 */     azy localazy = e(paramString);
/* 159 */     if (localazy != null) { throw new IllegalArgumentException("A team with the name '" + paramString + "' already exists!");
/*     */     }
/* 161 */     localazy = new azy(this, paramString);
/* 162 */     this.e.put(paramString, localazy);
/* 163 */     a(localazy);
/*     */     
/* 165 */     return localazy;
/*     */   }
/*     */   
/*     */   public void d(azy paramazy) {
/* 169 */     this.e.remove(paramazy.b());
/*     */     
/*     */ 
/*     */ 
/* 173 */     for (String str : paramazy.d()) {
/* 174 */       this.f.remove(str);
/*     */     }
/*     */     
/* 177 */     c(paramazy);
/*     */   }
/*     */   
/*     */   public boolean a(String paramString1, String paramString2) {
/* 181 */     if (!this.e.containsKey(paramString2)) return false;
/* 182 */     azy localazy = e(paramString2);
/*     */     
/* 184 */     if (i(paramString1) != null) {
/* 185 */       g(paramString1);
/*     */     }
/*     */     
/* 188 */     this.f.put(paramString1, localazy);
/* 189 */     localazy.d().add(paramString1);
/* 190 */     return true;
/*     */   }
/*     */   
/*     */   public boolean g(String paramString) {
/* 194 */     azy localazy = i(paramString);
/*     */     
/* 196 */     if (localazy != null) {
/* 197 */       a(paramString, localazy);
/* 198 */       return true;
/*     */     }
/* 200 */     return false;
/*     */   }
/*     */   
/*     */   public void a(String paramString, azy paramazy)
/*     */   {
/* 205 */     if (i(paramString) != paramazy) {
/* 206 */       throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + paramazy.b() + "'.");
/*     */     }
/*     */     
/* 209 */     this.f.remove(paramString);
/* 210 */     paramazy.d().remove(paramString);
/*     */   }
/*     */   
/*     */   public Collection f() {
/* 214 */     return this.e.keySet();
/*     */   }
/*     */   
/*     */   public Collection g() {
/* 218 */     return this.e.values();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public azy i(String paramString)
/*     */   {
/* 226 */     return (azy)this.f.get(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(azx paramazx) {}
/*     */   
/*     */ 
/*     */   public void b(azx paramazx) {}
/*     */   
/*     */ 
/*     */   public void c(azx paramazx) {}
/*     */   
/*     */ 
/*     */   public void a(azz paramazz) {}
/*     */   
/*     */ 
/*     */   public void a(String paramString) {}
/*     */   
/*     */ 
/*     */   public void a(azy paramazy) {}
/*     */   
/*     */ 
/*     */   public void b(azy paramazy) {}
/*     */   
/*     */   public void c(azy paramazy) {}
/*     */   
/*     */   public static String b(int paramInt)
/*     */   {
/* 254 */     switch (paramInt) {
/*     */     case 0: 
/* 256 */       return "list";
/*     */     case 1: 
/* 258 */       return "sidebar";
/*     */     case 2: 
/* 260 */       return "belowName";
/*     */     }
/* 262 */     return null;
/*     */   }
/*     */   
/*     */   public static int j(String paramString)
/*     */   {
/* 267 */     if (paramString.equalsIgnoreCase("list"))
/* 268 */       return 0;
/* 269 */     if (paramString.equalsIgnoreCase("sidebar"))
/* 270 */       return 1;
/* 271 */     if (paramString.equalsIgnoreCase("belowName")) {
/* 272 */       return 2;
/*     */     }
/* 274 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */