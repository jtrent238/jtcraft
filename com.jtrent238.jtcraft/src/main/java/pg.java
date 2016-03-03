/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonParser;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class pg extends pq
/*     */ {
/*  23 */   private static final Logger b = ;
/*     */   
/*     */   private final MinecraftServer c;
/*     */   private final File d;
/*  27 */   private final Set e = Sets.newHashSet();
/*  28 */   private int f = 65236;
/*  29 */   private boolean g = false;
/*     */   
/*     */   public pg(MinecraftServer paramMinecraftServer, File paramFile) {
/*  32 */     this.c = paramMinecraftServer;
/*  33 */     this.d = paramFile;
/*     */   }
/*     */   
/*     */   public void a() {
/*  37 */     if (this.d.isFile()) {
/*     */       try {
/*  39 */         this.a.clear();
/*  40 */         this.a.putAll(a(FileUtils.readFileToString(this.d)));
/*     */       } catch (IOException localIOException) {
/*  42 */         b.error("Couldn't read statistics file " + this.d, localIOException);
/*     */       } catch (JsonParseException localJsonParseException) {
/*  44 */         b.error("Couldn't parse statistics file " + this.d, localJsonParseException);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/*     */     try {
/*  51 */       FileUtils.writeStringToFile(this.d, a(this.a));
/*     */     } catch (IOException localIOException) {
/*  53 */       b.error("Couldn't save stats", localIOException);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, ph paramph, int paramInt)
/*     */   {
/*  59 */     int i = paramph.d() ? a(paramph) : 0;
/*  60 */     super.a(paramyz, paramph, paramInt);
/*  61 */     this.e.add(paramph);
/*     */     
/*  63 */     if ((paramph.d()) && (i == 0) && (paramInt > 0)) {
/*  64 */       this.g = true;
/*  65 */       if (this.c.at()) {
/*  66 */         this.c.ah().a(new fr("chat.type.achievement", new Object[] { paramyz.c_(), paramph.j() }));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public Set c() {
/*  72 */     HashSet localHashSet = Sets.newHashSet(this.e);
/*  73 */     this.e.clear();
/*  74 */     this.g = false;
/*  75 */     return localHashSet;
/*     */   }
/*     */   
/*     */   public Map a(String paramString) {
/*  79 */     JsonElement localJsonElement = new JsonParser().parse(paramString);
/*  80 */     if (!localJsonElement.isJsonObject()) return Maps.newHashMap();
/*  81 */     JsonObject localJsonObject1 = localJsonElement.getAsJsonObject();
/*  82 */     HashMap localHashMap = Maps.newHashMap();
/*     */     
/*  84 */     for (Map.Entry localEntry : localJsonObject1.entrySet()) {
/*  85 */       ph localph = pp.a((String)localEntry.getKey());
/*     */       
/*  87 */       if (localph != null) {
/*  88 */         pn localpn = new pn();
/*     */         
/*  90 */         if ((((JsonElement)localEntry.getValue()).isJsonPrimitive()) && (((JsonElement)localEntry.getValue()).getAsJsonPrimitive().isNumber())) {
/*  91 */           localpn.a(((JsonElement)localEntry.getValue()).getAsInt());
/*  92 */         } else if (((JsonElement)localEntry.getValue()).isJsonObject()) {
/*  93 */           JsonObject localJsonObject2 = ((JsonElement)localEntry.getValue()).getAsJsonObject();
/*     */           
/*  95 */           if ((localJsonObject2.has("value")) && (localJsonObject2.get("value").isJsonPrimitive()) && (localJsonObject2.get("value").getAsJsonPrimitive().isNumber())) {
/*  96 */             localpn.a(localJsonObject2.getAsJsonPrimitive("value").getAsInt());
/*     */           }
/*     */           
/*  99 */           if ((localJsonObject2.has("progress")) && (localph.l() != null)) {
/*     */             try {
/* 101 */               Constructor localConstructor = localph.l().getConstructor(new Class[0]);
/* 102 */               po localpo = (po)localConstructor.newInstance(new Object[0]);
/* 103 */               localpo.a(localJsonObject2.get("progress"));
/* 104 */               localpn.a(localpo);
/*     */             } catch (Throwable localThrowable) {
/* 106 */               b.warn("Invalid statistic progress in " + this.d, localThrowable);
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 111 */         localHashMap.put(localph, localpn);
/*     */       } else {
/* 113 */         b.warn("Invalid statistic in " + this.d + ": Don't know what " + (String)localEntry.getKey() + " is");
/*     */       }
/*     */     }
/*     */     
/* 117 */     return localHashMap;
/*     */   }
/*     */   
/*     */   public static String a(Map paramMap) {
/* 121 */     JsonObject localJsonObject1 = new JsonObject();
/*     */     
/* 123 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/* 124 */       if (((pn)localEntry.getValue()).b() != null) {
/* 125 */         JsonObject localJsonObject2 = new JsonObject();
/*     */         
/* 127 */         localJsonObject2.addProperty("value", Integer.valueOf(((pn)localEntry.getValue()).a()));
/*     */         try
/*     */         {
/* 130 */           localJsonObject2.add("progress", ((pn)localEntry.getValue()).b().a());
/*     */         } catch (Throwable localThrowable) {
/* 132 */           b.warn("Couldn't save statistic " + ((ph)localEntry.getKey()).e() + ": error serializing progress", localThrowable);
/*     */         }
/*     */         
/* 135 */         localJsonObject1.add(((ph)localEntry.getKey()).e, localJsonObject2);
/*     */       } else {
/* 137 */         localJsonObject1.addProperty(((ph)localEntry.getKey()).e, Integer.valueOf(((pn)localEntry.getValue()).a()));
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 142 */     return localJsonObject1.toString();
/*     */   }
/*     */   
/*     */   public void d() {
/* 146 */     for (ph localph : this.a.keySet()) {
/* 147 */       this.e.add(localph);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(mw parammw) {
/* 152 */     int i = this.c.al();
/* 153 */     HashMap localHashMap = Maps.newHashMap();
/*     */     
/* 155 */     if ((this.g) || (i - this.f > 300)) {
/* 156 */       this.f = i;
/*     */       
/* 158 */       for (ph localph : c()) {
/* 159 */         localHashMap.put(localph, Integer.valueOf(a(localph)));
/*     */       }
/*     */     }
/*     */     
/* 163 */     parammw.a.a(new gd(localHashMap));
/*     */   }
/*     */   
/*     */   public void b(mw parammw) {
/* 167 */     HashMap localHashMap = Maps.newHashMap();
/*     */     
/* 169 */     for (pb localpb : pc.e) {
/* 170 */       if (a(localpb)) {
/* 171 */         localHashMap.put(localpb, Integer.valueOf(a(localpb)));
/* 172 */         this.e.remove(localpb);
/*     */       }
/*     */     }
/*     */     
/* 176 */     parammw.a.a(new gd(localHashMap));
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 180 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */