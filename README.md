<p align="center">
  <img src="https://raw.githubusercontent.com/oslcJS/.github/main/assets/VAULT.gif" width="160">
</p>

<h1 align="center">QuickTemplate</h1>

<p align="center">
Template plugin for starting a new QuickPlugin with the shared build, command, config, and branding structure.
</p>

---

<p align="center">
  <span style="font-family: 'IBM Plex Mono', monospace; font-style: italic; border: 1px solid #1c1c1c; padding: 6px 10px; color: #555; background: #000;">
    status <span style="color:#222;">/</span>
    <span style="color:#fff; font-weight:600;">template</span>
  </span>
</p>

<div align="center">
  <table>
    <tr>
      <td><img src="https://raw.githubusercontent.com/oslcJS/.github/main/assets/logo_03.png" width="72"></td>
      <td><strong>QuickPlugins</strong><br>Small, fast Minecraft plugins built for modern Paper, Spigot, and Purpur servers.</td>
    </tr>
  </table>
</div>

---

## overview

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/14.gif)

QuickTemplate is the starter project for new QuickPlugins. It includes the Maven profile layout, default command registration, config handling, message utility, PlaceholderAPI soft dependency, and QuickLink structure used across the plugin set.

---

## features

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/2.gif)

- ready-to-copy plugin scaffold
- shared Maven build profiles
- default command wiring
- YAML config and messages
- permission skeleton
- PlaceholderAPI soft dependency
- QuickLink package pattern

---

## compatibility

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/3.gif)

- Paper
- Spigot
- Purpur
- 1.20.4 - 1.21.8
- Paper 26.1.1 - 26.1.2

---

## installs

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/4.gif)

Copy the project, rename the package, update `plugin.yml`, then build with Maven. Drop the generated jar into `/plugins` for testing.

---

## commands

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/5.gif)

```text
/quicktemplate
/qt help
```

---

## license

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/6.gif)

MIT

---

## plugins

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/7.gif)

Includes PlaceholderAPI as an optional soft dependency for plugins that need placeholder support.

---

## philosophy

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/8.gif)

QuickTemplate keeps new plugin setup consistent so each QuickPlugin starts with the same build, config, permission, and README conventions.

---

## backend

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/9.gif)

Built on Bukkit/Paper APIs with Maven shading, filtered resources, Java 17 release output, and multi-version Paper API profiles.

---

## roadmap

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/10.gif)

- keep profile matrix aligned with active plugins
- add reusable examples as patterns stabilize
- update branding defaults across new plugin starts

---

## permissions

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/11.gif)

```text
quicktemplate.*
quicktemplate.admin
quicktemplate.use
```

---

## configuration

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/12.gif)

```yaml
messages:
  prefix: "&9[QuickTemplate] &r"
  no-permission: "&cYou don't have permission."
  reloaded: "&aConfig reloaded."
```

---

## api

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/13.gif)

```java
QuickTemplate plugin = QuickTemplate.getInstance();
```

---

## stats

![](https://raw.githubusercontent.com/oslcJS/.github/main/assets/15.gif)

```text
performance   / scaffold
memory        / minimal
design        / reusable base
```
